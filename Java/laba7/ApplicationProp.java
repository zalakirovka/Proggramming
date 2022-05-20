package org.example.laba.laba7;

import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import java.util.Properties;

    public class ApplicationProp {
        private static final String FILE_NAME = "/application.properties";

        private static ApplicationProp INSTANCE;

        private final Properties properties = new Properties();

        public static ApplicationProp getInstance() {
            if (Objects.isNull(INSTANCE)) {
                INSTANCE = new ApplicationProp();
                INSTANCE.init();
            }

            return INSTANCE;
        }

        private void init() {
            try (InputStream is = getClass().getResourceAsStream(FILE_NAME)) {
                if (Objects.nonNull(is)) {
                    properties.load(is);
                }

            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

        public Properties getProperties() {
            return properties;
        }
    }

