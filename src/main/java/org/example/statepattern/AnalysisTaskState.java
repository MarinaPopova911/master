package org.example.statepattern;

public class AnalysisTaskState implements TaskState {
    @Override
    public String getNameState() {
        return "Анализ";
    }

    public DraftTaskState draftOrderState() {
        return new DraftTaskState();
    }

    public RemoveOrderState removeOrderState() {
        return new RemoveOrderState();
    }

    public TaskWorkState taskWorkOrderState() {
        return new TaskWorkState();
    }
}
