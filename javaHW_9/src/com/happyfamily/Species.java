package com.happyfamily;

public enum Species {
    FISH(false, 1, false), ROBOCAT(true, 8, false), DOG(false, 4, true), DOMESTICCAT(false, 4, true), UNKNOWN(false, 0, false);

    private boolean canFly;
    private int numberOfLegs;
    private boolean hasFur;

    Species(boolean canFly, int numberOfLegs, boolean hasFur) {
        this.canFly = canFly;
        this.numberOfLegs = numberOfLegs;
        this.hasFur = hasFur;
    }

    public boolean canFly() {
        return canFly;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public boolean hasFur() {
        return hasFur;
    }
}
