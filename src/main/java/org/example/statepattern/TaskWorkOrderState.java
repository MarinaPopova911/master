package org.example.statepattern;

public class TaskWorkOrderState implements OrderState {
    @Override
    public String getNameState() {
        return "В работе";
    }

    public RemoveOrderState removeOrderState() {
        return new RemoveOrderState();
    }

    public DoneOrderState doneOrderState() {
        return new DoneOrderState();
    }
}
