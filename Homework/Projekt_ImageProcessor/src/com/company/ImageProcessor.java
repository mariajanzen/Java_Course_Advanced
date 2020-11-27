package com.company;

import com.company.entity.DownloadedImage;
import com.company.entity.ImageDescriptor;
import com.company.service.DownloadService;
import com.company.service.FileService;


import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class ImageProcessor {

    private FileService fileService;
    private DownloadService downloadService;

    public static void main(String[] args) throws IOException {

        String csvFile = "test2.csv";

        FileService fs = new FileService();
        DownloadService ds =  new DownloadService();
        ImageProcessor processor = new ImageProcessor(fs, ds);
        processor.process(csvFile);

    }

    public ImageProcessor(FileService fileService, DownloadService downloadService) {
        this.fileService = fileService;
        this.downloadService = downloadService;
    }

    public void process(String fileName) throws IOException {
        //main logic is here

        List<ImageDescriptor> imageDescriptors = fileService.readImageDescriptors(fileName);

        List<DownloadedImage> downloadedImages = downloadService.downloadImages(imageDescriptors);

        List<DownloadedImage> successfullyDownloadedimages = downloadedImages
                .stream()
                .filter(DownloadedImage::isSuccessful)
                .collect(Collectors.toList());



        //try {
        //  DownloadService ds = new Downloadservice();
        //  List<DownloadedImage> downloadedImages = ds.downloadImages(images);
        //}


    }

}