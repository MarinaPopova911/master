package org.example.observerpattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

public class Publisher {
    private static Logger logger = LoggerFactory.getLogger(Publisher.class);
    private ArrayList<ChatInterface> observers = new ArrayList<>();

    public void addObserver(ChatInterface observer) {
        observers.add(observer);
    }

    public void removeObserver(ChatInterface observer) {
        observers.remove(observer);
    }

    public void addMessage(String message) {
        logger.info(String.format("Новое сообщение в чате: %s", message));
        notifyObservers(message);
    }

    private void notifyObservers(String message) {
        for (ChatInterface chatInterface : observers) {
            chatInterface.update(message);
        }
    }
}