package org.example.statepattern;

public class DoneOrderState implements OrderState {
    @Override
    public String getNameState() {
        return "Готово";
    }
}
