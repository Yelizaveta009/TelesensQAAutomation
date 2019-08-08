package lesson.six;

public interface VisualComponent {
    public void draw();

    default void draw3D() {
        System.out.println("Component 3D");
    }
}
