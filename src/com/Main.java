package com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Main {
    public static void main(String[] args)throws Exception {
        Properties defaultProperties=new Properties();
        defaultProperties.setProperty("bla","my default");

        Properties properties=new Properties(defaultProperties);
//        properties.setProperty("one","1");
//        System.out.println(properties.getProperty("one"));
//        FileOutputStream out = new FileOutputStream("myProperties");
//        properties.store(out,"my comment");
        FileInputStream input=new FileInputStream("myProperties");
        properties.load(input);
        System.out.println(properties.getProperty("jarik"));
        System.out.println(properties.getProperty("bla"));
    }
}
