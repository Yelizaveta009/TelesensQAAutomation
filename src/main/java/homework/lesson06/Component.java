package homework.lesson06;

public class Component implements VisualComponent {
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

    @Override
    public void draw() {
        System.out.println("Component");

    }
}