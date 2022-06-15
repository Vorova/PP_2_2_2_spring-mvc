package web.model;

public class Car {

    private final String model;
    private final String color;
    private final int number;

    public Car(String model, String color, int number) {
        this.model = model;
        this.color = color;
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getNumber() {
        return number;
    }
}
