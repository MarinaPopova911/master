package org.example.statepattern;

public class AnalysisOrderState implements OrderState {
    @Override
    public String getNameState() {
        return "Анализ";
    }

    public DraftOrderState draftOrderState() {
        return new DraftOrderState();
    }

    public RemoveOrderState removeOrderState() {
        return new RemoveOrderState();
    }

    public TaskWorkOrderState taskWorkOrderState() {
        return new TaskWorkOrderState();
    }
}
