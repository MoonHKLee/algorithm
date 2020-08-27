package javaExample;

public class Sedan extends Car {
    private String airbag;

    public Sedan(String name, int speed, int wheelCount,String airbag) {
        super(name, speed, wheelCount);
        this.airbag = airbag;
    }

    public String getAirbag() {
        return airbag;
    }

    public void setAirbag(String airbag) {
        this.airbag = airbag;
    }
}
