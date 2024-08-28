package org.example.observerpattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserObserver implements ChatInterface {
    private static Logger logger = LoggerFactory.getLogger(UserObserver.class);

    @Override
    public void update(String message) {
        logger.info(String.format("Новое сообщение в чате(пользователь): %s", message));
    }
}
