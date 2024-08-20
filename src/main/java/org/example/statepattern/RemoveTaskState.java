package org.example.statepattern;

public class RemoveTaskState implements TaskState {
    @Override
    public String getNameState() {
        return "Удалить";
    }
}
