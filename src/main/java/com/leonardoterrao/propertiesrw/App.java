package com.leonardoterrao.propertiesrw;

import com.leonardoterrao.propertiesrw.read.ReadProperties;

import java.util.Properties;
import java.util.TreeSet;

public class App {

    private static final String PATH_PROPERTIES = "~/---/resources/";

    public static void main(String[] args) {
//        Properties propertiesPt = ReadProperties.getProperties(PATH_PROPERTIES + "message_pt.properties");
//        TreeSet<String> keysPt = new TreeSet<>();
//        propertiesPt.entrySet().forEach(prop -> keysPt.add(prop.getKey().toString()));

//        keysPt.forEach(k -> System.out.println(k));
//        keysPt.forEach(k -> System.out.println(propertiesPt.getProperty(k)));

//        Properties propertiesEn = ReadProperties.getProperties(PATH_PROPERTIES + "message_en.properties");
//        TreeSet<String> keysEn = new TreeSet<>();
//        propertiesEn.entrySet().forEach(prop -> keysEn.add(prop.getKey().toString()));
//        keysEn.forEach(k -> System.out.println(propertiesEn.getProperty(k)));

//        Properties propertiesEs = ReadProperties.getProperties(PATH_PROPERTIES + "message_es.properties");
//        TreeSet<String> keysEs = new TreeSet<>();
//        propertiesEs.entrySet().forEach(prop -> keysEs.add(prop.getKey().toString()));
//        keysEs.forEach(k -> System.out.println(propertiesEs.getProperty(k)));

//        Properties propertiesPt = ReadProperties.getProperties(PATH_PROPERTIES + "ValidationMessages_pt.properties");
//        TreeSet<String> keysPt = new TreeSet<>();
//        propertiesPt.entrySet().forEach(prop -> keysPt.add(prop.getKey().toString()));
//        keysPt.forEach(k -> System.out.println(k));
//        keysPt.forEach(k -> System.out.println(propertiesPt.getProperty(k)));
//        System.out.println(keysPt.size());

//        Properties propertiesEn = ReadProperties.getProperties(PATH_PROPERTIES + "ValidationMessages_en.properties");
//        TreeSet<String> keysEn = new TreeSet<>();
//        propertiesEn.entrySet().forEach(prop -> keysEn.add(prop.getKey().toString()));
//        keysPt.forEach(k -> System.out.println(k));
//        keysEn.forEach(k -> System.out.println(propertiesEn.getProperty(k)));
//        System.out.println(keysEn.size());

//        Properties propertiesEs = ReadProperties.getProperties(PATH_PROPERTIES + "ValidationMessages_es.properties");
//        TreeSet<String> keysEs = new TreeSet<>();
//        propertiesEs.entrySet().forEach(prop -> keysEs.add(prop.getKey().toString()));
//        keysPt.forEach(k -> System.out.println(k));
//        keysEs.forEach(k -> System.out.println(propertiesEs.getProperty(k)));
//        System.out.println(keysEs.size());

        Properties propertiesPt = ReadProperties.getProperties(PATH_PROPERTIES + "message_emplacamento_pt.properties");
        TreeSet<String> keysPt = new TreeSet<>();
        propertiesPt.entrySet().forEach(prop -> keysPt.add(prop.getKey().toString()));
//        keysPt.forEach(k -> System.out.println(k));
//        keysPt.forEach(k -> System.out.println(propertiesPt.getProperty(k)));
//        System.out.println(keysPt.size());

        Properties propertiesEn = ReadProperties.getProperties(PATH_PROPERTIES + "message_emplacamento_en.properties");
        TreeSet<String> keysEn = new TreeSet<>();
        propertiesEn.entrySet().forEach(prop -> keysEn.add(prop.getKey().toString()));
//        keysPt.forEach(k -> System.out.println(k));
//        keysEn.forEach(k -> System.out.println(propertiesEn.getProperty(k)));
//        System.out.println(keysEn.size());

        Properties propertiesEs = ReadProperties.getProperties(PATH_PROPERTIES + "message_emplacamento_es.properties");
        TreeSet<String> keysEs = new TreeSet<>();
        propertiesEs.entrySet().forEach(prop -> keysEs.add(prop.getKey().toString()));
//        keysPt.forEach(k -> System.out.println(k));
        keysEs.forEach(k -> System.out.println(propertiesEs.getProperty(k)));
//        System.out.println(keysEs.size());

//        for (String key : keysPt) {
//            if (!keysEs.contains(key)) {
//                System.out.println(key);
//            }
//        }
    }

}