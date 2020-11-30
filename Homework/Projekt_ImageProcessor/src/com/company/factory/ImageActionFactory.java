package com.company.factory;

import com.company.action.DefaultImageAction;
import com.company.action.ImageAction;
import com.company.service.ActionsConfigService;

import java.util.*;

public class ImageActionFactory {

    private ActionsConfigService configService;
    private Map<String, ImageAction> imageActionMap = new HashMap<>();


    public ImageActionFactory(ActionsConfigService configService) throws Exception {
        this.configService = configService;

        List<String> actionClassNames = configService.getActionClassNames();
        String actionPackage = configService.getActionPackage();

        for(String className:actionClassNames) {
            ImageAction imageAction = (ImageAction) Class.forName(actionPackage + "." + className)
                    .getConstructor()
                    .newInstance();
            imageActionMap.put(imageAction.getName(), imageAction);
        }
    }

    public ImageAction getAction(String actionName) {
        ImageAction imageAction = imageActionMap.get(actionName);
        if(imageAction == null) {
            return new DefaultImageAction();
        }
        return imageAction;
    }

   /* public static void main(String[] args) throws Exception{

        ImageActionFactory factory = new ImageActionFactory(new ActionsConfigService());

        ImageAction preview = factory.getAction("PREVIEW");
        preview.doAction(null);
        ImageAction grasc = factory.getAction("GRAYSCALE");
        grasc.doAction(null);

        ImageAction newAction = factory.getAction("NEW ACTION");
        newAction.doAction(null);

        ImageAction aDefault = factory.getAction("DEFAULT");
        aDefault.doAction(null);
    }*/
}