package lesson.six;

public class Component {
    private int q = 3;{
    }

    public Component(int q) {
    }

    public Component() {
    }

    @Override
    public String toString() {
        return String.valueOf(q);
    }

    public void draw() {
        System.out.println("Component");

    }
}