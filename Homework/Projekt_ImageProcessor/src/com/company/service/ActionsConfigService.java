package com.company.service;

import com.company.factory.ImageActionFactory;
import org.junit.runner.RunWith;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

public class ActionsConfigService {

    private Properties prop = new Properties();

    public ActionsConfigService() throws IOException {
        loadProperties();
    }

    private void loadProperties() throws IOException {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        InputStream stream = loader.getResourceAsStream("actions.properties");
        prop.load(stream);
    }

    public String getActionPackage() {
        return (String)prop.get("action.package");
    }

    public List<String> getActionClassNames() {
        return Arrays.asList(((String) prop.get("action.names")).split(","));
    }

}

/*
public class ActionsConfigService {

    private Properties prop = new Properties();

    public ActionsConfigService()throws IOException {
        loadProperties();
    }

    private void loadProperties() throws IOException{
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        InputStream stream = loader.getResourceAsStream("myProp.properties");
        prop.load(stream);
    }

    public String getActionPackage() {

        return (String)prop.get("action.package");
    }

    public List<String> getActionClassNames() {

        return Arrays.asList(((String) prop.get("action.names")).split(","));
    }

}

 */