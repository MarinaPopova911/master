package org.example.statepattern;

public class NewTaskState implements TaskState {
    @Override
    public String getNameState() {
        return "Новая задача";
    }

    public RemoveTaskState removeTaskState() {
        return new RemoveTaskState();
    }

    public AnalysisTaskState analysisTaskState() {
        return new AnalysisTaskState();
    }
}
