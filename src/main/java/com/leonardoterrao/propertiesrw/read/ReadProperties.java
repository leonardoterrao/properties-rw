package com.leonardoterrao.propertiesrw.read;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReadProperties {

    private static Logger logger = Logger.getLogger("ReadProperties");

    public static Properties getProperties(String file) {
        Properties properties = new Properties();
        InputStream input = null;

        try {
            input = new FileInputStream(file);
            properties.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
            logger.log(Level.SEVERE, " - ERRO NA LEITURA: " + ex.getMessage(), ex);
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    logger.log(Level.SEVERE, " - ERRO NA LEITURA: " + e.getMessage(), e);
                    e.printStackTrace();
                }
            }
        }

        return properties;
    }
}