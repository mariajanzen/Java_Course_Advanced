package com.company.service;

import com.company.entity.ImageDescriptor;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class FileNameGeneratorService {

    public String generateImageName(ImageDescriptor descriptor) throws MalformedURLException {
        String imageURL = descriptor.getImageURL();
        String ationName = descriptor.getActionName();
        String path = new URL(imageURL).getPath();
        File file = new File(path);
        String fileName = ationName + file.getAbsolutePath().replace("/", "_");

        return fileName;
    }
}
