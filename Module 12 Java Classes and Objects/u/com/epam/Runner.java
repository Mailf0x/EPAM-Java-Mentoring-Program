package com.epam;

public class Runner {
    private boolean field;

    public Runner(Runner runner) {
        field = runner.getField();
    }

    public boolean getField() {
        return field;
    }
}
