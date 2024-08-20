package org.example.statepattern;

public class RemoveOrderState implements TaskState {
    @Override
    public String getNameState() {
        return "Удалить";
    }
}
