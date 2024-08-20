package org.example.statepattern;

public class TaskWorkState implements TaskState {
    @Override
    public String getNameState() {
        return "В работе";
    }

    public RemoveOrderState removeOrderState() {
        return new RemoveOrderState();
    }

    public DoneTaskState doneOrderState() {
        return new DoneTaskState();
    }
}
