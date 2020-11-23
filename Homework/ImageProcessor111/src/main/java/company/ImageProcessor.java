package company;

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

    public ImageProcessor(FileService fs, DownloadService downloadService) {
        this.fileService = fs;
        this.downloadService = downloadService;

    }

    public static void main(String[] args) throws IOException {

        String csvFile = "test1.csv";

        FileService fs = new FileService();
        DownloadService ds = new DownloadService();
        ImageProcessor processor = new ImageProcessor(fs, ds);

        try {
            processor.process(csvFile);
        } catch (IOException ex) {
            System.out.println("the csv-file is not found");
        }

    }

    public void process(String fileName) throws IOException {
        // main logic is here

        List<ImageDescriptor> imageDescriptors = fileService.readImageDescriptors(fileName);
       // System.out.println(imageDescriptors);

        //List<String> imageUrls = imageDescriptors.stream().map(d -> d.getImageURL()).collect(Collectors.toList());
        List<DownloadedImage> downloadedImages = downloadService.downloadImages(imageDescriptors);

        List<DownloadedImage> successfullyDownloadedImages = downloadedImages
                .stream()
                .filter(DownloadedImage::isSuccessful)
                .collect(Collectors.toList());



    }
}
