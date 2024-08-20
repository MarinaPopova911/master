package org.example.statepattern;

public class DoneTaskState implements TaskState {
    @Override
    public String getNameState() {
        return "Готово";
    }
}
