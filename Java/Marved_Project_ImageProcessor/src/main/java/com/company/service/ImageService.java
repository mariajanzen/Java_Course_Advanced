package com.company.service;

import com.company.action.ImageAction;
import com.company.entity.DownloadedImage;
import com.company.factory.ImageActionFactory;

import java.awt.image.BufferedImage;

public class ImageService {

    private ImageActionFactory factory;

    public ImageService(ImageActionFactory factory) {
        this.factory = factory;
    }

   /* public BufferedImage processImage(BufferedImage image, String actionName) throws Exception {
        ImageAction action = factory.getAction(actionName);
        return action.doAction(image);
    }*/

    public DownloadedImage processImage(DownloadedImage image) {
        ImageAction action = factory.getAction(image.getDescriptor().getActionName());
        try {
            BufferedImage result = action.doAction(image.getImage());
            return new DownloadedImage(result, true, image.getDescriptor());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return new DownloadedImage(null, false, image.getDescriptor());
    }
}