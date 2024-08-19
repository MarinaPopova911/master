package org.example.statepattern;

public class RemoveOrderState implements OrderState{
    @Override
    public String getNameState() {
        return "Удалить";
    }
}
