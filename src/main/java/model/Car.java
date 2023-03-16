package model;

public class Car {

    private String name;

    private int position = 0;


    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public String setName(String name) {
        return this.name = name;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
