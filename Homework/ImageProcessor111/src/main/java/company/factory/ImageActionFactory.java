package company.factory;

import com.company.action.DefaultImageAction;
import com.company.action.GrayscaleImageAction;
import com.company.action.ImageAction;
import com.company.action.PreviewImageAction;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class ImageActionFactory {

    private Properties prop = new Properties();
    private Map<String, ImageAction> imageActionsMap = new HashMap<>();

    public ImageActionFactory() throws Exception {
        loadProperties();

        List<String> actionClassNames = getActionClassNames();
        String actionPackage = getActionPackage();

        for (String className:actionClassNames) {
            ImageAction imageAction = (ImageAction) Class
                    .forName(actionPackage + "." + className)
                    .getConstructor().newInstance();
            imageActionsMap.put(imageAction.getName(), imageAction)

        }
    }

    public ImageAction getAction(String actionName) {
        switch (actionName) {
            case "PREVIEW":
                return new PreviewImageAction();
            case "GRAYSCALE":
                return new GrayscaleImageAction();
            default:
                return new DefaultImageAction();
        }
    }

    public void loadProperties() {
        try (
                InputStream input= ImageActionFactory
                        .class.getClassLoader().getResourceAsStream("actions.properties");

                ) {
            if (input == null) {
                System.out.println("sorry, unable to find action.properties");
                return;
            }
            prop.load(input);
        } catch (IOException exception) {
            exception.printStackTrace();
        }



    }

    private String getActionPackage() {
        return (String)prop.get("action.package");
    }

    private List<String> getActionClassNames() {
        return Arrays.asList((String)prop.get("action.names"));
    }

    public static void main(String[] args) throws Exception {
        ImageActionFactory factory = new ImageActionFactory();
        ImageAction aDefault = factory.getAction("DEFAULT");
        aDefault.doAction(null);
    }
}
