package com.company.service;

import com.company.factory.ImageActionFactory;
import org.junit.runner.RunWith;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

public class ActionsConfigService implements ActionsConfigServiceInt {

    private Properties prop = new Properties();

    public ActionsConfigService() {
        loadProperties();
    }

    private void loadProperties() {
        try (
            InputStream input = ImageActionFactory.class
                    .getClassLoader()
                    .getResourceAsStream("actions.properties")) {
            if(input == null) {
                System.out.println("Sorry, unable to find actions.properties");
                return;
            }
            //load a properties file from class path, inside static method
            prop.load(input);
        } catch (
                IOException ex) {
            ex.printStackTrace();
        }
        /*ClassLoader loader = Thread.currentThread().getContextClassLoader();
        InputStream stream = loader.getResourceAsStream("actions.properties");
        prop.load(stream);*/
    }

    public String getActionPackage() {
        return (String)prop.get("action.package");
    }

    public List<String> getActionClassNames() {
        return Arrays.asList(((String) prop.get("action.names")).split(","));
    }

}
