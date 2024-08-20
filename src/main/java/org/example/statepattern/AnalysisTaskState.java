package org.example.statepattern;

public class AnalysisTaskState implements TaskState {
    @Override
    public String getNameState() {
        return "Анализ";
    }

    public DraftTaskState draftTaskState() {
        return new DraftTaskState();
    }

    public RemoveTaskState removeTaskState() {
        return new RemoveTaskState();
    }

    public TaskWorkState taskWorkTaskState() {
        return new TaskWorkState();
    }
}
