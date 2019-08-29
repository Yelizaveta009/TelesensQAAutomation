package homework.lesson06;

public class Button extends Component {
    private byte c = 1;{
    }
    public Button (byte c) {
        super();
    }

    public Button() {
    }

    @Override
    public String toString() {
        return String.valueOf(c);
    }

    @Override
    public void draw() {
        System.out.println("Button");
    }
}

