package com.kandytan.util.pro;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Kandy Tan
 * @since 1.0
 */
public class ProUtils {

    private static final Logger logger = LoggerFactory.getLogger( ProUtils.class);

    public static Properties getPro(String path) {
        Properties p = new Properties();
        Resource r = new ClassPathResource(path);
        try {
            p.load(new FileInputStream(r.getFile()));
        } catch (IOException e) {
            logger.error(e.getMessage(), e);
        }
        return p;
    }

}
