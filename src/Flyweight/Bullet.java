package Flyweight;

public class Bullet {

    private String color;
    private int weight;

    public Bullet(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Bullet{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
