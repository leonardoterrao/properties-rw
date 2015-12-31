package com.leonardoterrao.propertiesrw;

import com.leonardoterrao.propertiesrw.read.ReadPropertiesFile;

import java.util.Properties;
import java.util.TreeSet;

public class App {

    private static final String PATH_PROPERTIES = "~/---/resources/";

    public static void main(String[] args) {
        Properties propertiesPt = ReadPropertiesFile.getProperties(PATH_PROPERTIES + "message_pt.properties");
        TreeSet<String> keysPt = new TreeSet<>();
        propertiesPt.entrySet().forEach(prop -> keysPt.add(prop.getKey().toString()));
        keysPt.forEach(k -> System.out.println(k));
        keysPt.forEach(k -> System.out.println(propertiesPt.getProperty(k)));
        System.out.println(keysPt.size());

//        for (String key : keysPt) {
//            if (!keysEs.contains(key)) {
//                System.out.println(key);
//            }
//        }
    }

}