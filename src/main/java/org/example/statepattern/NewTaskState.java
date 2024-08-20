package org.example.statepattern;

public class NewTaskState implements TaskState {
    @Override
    public String getNameState() {
        return "Новая задача";
    }

    public RemoveOrderState removeOrderState() {
        return new RemoveOrderState();
    }

    public AnalysisTaskState analysisOrderState() {
        return new AnalysisTaskState();
    }
}
