package org.example.singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppConnection {
    private static Logger logger = LoggerFactory.getLogger(AppConnection.class);
    public AppConnection() {
        logger.info("Приложение запущено");
    }

    public void appCompleted(){
        logger.info("Приложение выполняется");
    }
}
