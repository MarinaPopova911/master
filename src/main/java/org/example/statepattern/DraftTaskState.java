package org.example.statepattern;

public class DraftTaskState implements TaskState {
    @Override
    public String getNameState() {
        return "draft";
    }

    public NewTaskState newTaskOrderState() {
        return new NewTaskState();
    }
}
