package com.bek.helpers;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.ResourceBundle;


public class Props {
    private static Properties environmentProps;
    private static Properties properties;


    /**
     * Gets the key from messages.properties for a Site
     *
     * @param key
     **/
    public static String getMessage(String key) {

        if ((key == null) || key.isEmpty()) {
            return "";
        } else {
            return ResourceBundle.getBundle("props/messages").getString(key);

        }
    }

    /**
     * Gets the key from Config.properties related to chosen profile
     *
     * @param key
     **/

    public static String getProp(String key) {
        if ((key == null) || key.isEmpty()) {
            return "";
        } else {
            return properties.getProperty(key);

        }
    }


    public static void loadRunConfigProps(String configPropertyFileLocation) {
    	environmentProps = new Properties();
    	try (InputStream inputStream = Props.class.getResourceAsStream(configPropertyFileLocation)) {
    		if (inputStream == null) {
    			throw new FileNotFoundException(configPropertyFileLocation);
    		}
    		environmentProps.load(inputStream);
    		environmentProps.getProperty("site");
    	} catch (IOException e) {
    		throw new RuntimeException(
    				"Could not read " + configPropertyFileLocation + " resource file: " + e);
    	}
    	properties = new Properties();
    	try (InputStream inputStream = Props.class.getResourceAsStream(environmentProps.getProperty("profile.path"))) {
    		properties.load(inputStream);
    	} catch (IOException e) {
    		e.getMessage();
    	}
    }
}
