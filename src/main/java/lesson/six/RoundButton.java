package lesson.six;

public class RoundButton extends Button {
    private double e = 3.2;{
    }

    public RoundButton(double e) {
    }

    @Override
    public String toString() {
        return String.valueOf(e);
    }

    @Override
    public void draw() {
        System.out.println("RoundButton");
    }
}
