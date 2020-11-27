package company.action;

import java.awt.image.BufferedImage;

public interface ImageAction {

    BufferedImage doAction(BufferedImage image) throws Exception;

    String getName();
}
