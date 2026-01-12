package core.basesyntax;

public class Ball {
    private String color;

    public String getColor() {
        return color;
    }

    public int getNumber() {
        return number;
    }

    private int number;

    public Ball(String color, int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "color='" + color + '\'' +
                ", number=" + number +
                '}';
    }
}
