package org.example.statepattern;

public class DraftOrderState implements OrderState {
    @Override
    public String getNameState() {
        return "draft";
    }

    public NewTaskOrderState newTaskOrderState() {
        return new NewTaskOrderState();
    }
}
