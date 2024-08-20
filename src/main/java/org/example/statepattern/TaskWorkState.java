package org.example.statepattern;

public class TaskWorkState implements TaskState {
    @Override
    public String getNameState() {
        return "В работе";
    }

    public RemoveTaskState removeTaskState() {
        return new RemoveTaskState();
    }

    public DoneTaskState doneTaskState() {
        return new DoneTaskState();
    }
}
