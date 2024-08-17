package org.example.singleton;

public class AppSingletone {
    private static AppConnection appConnection;

    private AppSingletone() {
        appConnection = new AppConnection();
    }

    public static AppConnection getInstant() {
        if (appConnection == null) {
            new AppSingletone();
        }
        return appConnection;
    }
}
