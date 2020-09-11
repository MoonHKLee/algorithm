package javaExample;

public class Car {
    private String name;
    private int speed;
    private int wheelCount;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    public Car(String name, int speed, int wheelCount) {
        this.name = name;
        this.speed = speed;
        this.wheelCount = wheelCount;
    }
}
