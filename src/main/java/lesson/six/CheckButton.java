package lesson.six;

public class CheckButton extends Button {
    private long d = 987654321; {
    }

    public CheckButton(long d) {
        super();
    }

    @Override
    public String toString() {
        return String.valueOf(d);

    }

    @Override
    public void draw() {
        System.out.println("CheckButton");
    }
}
