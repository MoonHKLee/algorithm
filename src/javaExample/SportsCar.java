package javaExample;

public class SportsCar extends Car {
    private String boosterEngine;

    public SportsCar(String name, int speed, int wheelCount, String boosterEngine) {
        super(name, speed, wheelCount);
        this.boosterEngine = boosterEngine;
    }

    public String getBoosterEngine() {
        return boosterEngine;
    }

    public void setBoosterEngine(String boosterEngine) {
        this.boosterEngine = boosterEngine;
    }
}
