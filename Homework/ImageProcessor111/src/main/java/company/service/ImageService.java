package company.service;

import com.company.action.ImageAction;
import com.company.factory.ImageActionFactory;

import java.awt.image.BufferedImage;

public class ImageService {
    ImageActionFactory factory;

    public ImageService(ImageActionFactory factory) {
        this.factory = factory;
    }

    public BufferedImage processImage(BufferedImage image, String actionName) throws Exception {
        ImageAction action = factory.getAction(actionName);
        return action.doAction(image);
    }
}
