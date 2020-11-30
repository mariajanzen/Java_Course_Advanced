package com.company.action;

import java.awt.image.BufferedImage;

public class PreviewImageAction implements ImageAction {
    @Override
    public String getName() {
        return "PREVIEW";
    }

    @Override
    public BufferedImage doAction(BufferedImage image) throws Exception {
        System.out.println("Generating a preview");
        return image;
    }
}