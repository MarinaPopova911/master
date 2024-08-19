package org.example.statepattern;

public class NewTaskOrderState implements OrderState {
    @Override
    public String getNameState() {
        return "Новая задача";
    }

    public RemoveOrderState removeOrderState() {
        return new RemoveOrderState();
    }

    public AnalysisOrderState analysisOrderState() {
        return new AnalysisOrderState();
    }
}
