package com.seleniumframework.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

//It is just a simple file which will read the key from data.properties file and give it to you
public class PropertiesReader {



    public static String readKey(String key)
    {

        //Create the instance of Properties file
        Properties p = null;

        //Fetch the property file
        try
        {
            FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/data.properties");

            p = new Properties();
            p.load(fileInputStream);
        }
        catch(FileNotFoundException e)
        {
            throw new RuntimeException(e);
        } catch (IOException e)
        {
            throw new RuntimeException(e);
        }
        return p.getProperty(key);

    }
}
