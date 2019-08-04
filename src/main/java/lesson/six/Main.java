package lesson.six;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Label label = new Label("Hello");
        Button button = new Button((byte) 1);
        CheckButton checkButton = new CheckButton(987654321);
        RoundButton roundButton = new RoundButton(3.2);
        Component component = new Component(3);
        Object[] components = new Component[]
                {label, button, checkButton, roundButton, component, label, roundButton, component, button, checkButton};

        System.out.println(Arrays.asList(components));

        for (int i = 0; i < components.length; i++)
            ((Component) components[i]).draw();

        System.out.println ("Экземпляры класса Button и его наследников: ");
        for (int i = 0; i < components.length; i++) {
            if (components[i] != component && components[i] != label ) {
                System.out.print(components[i]+"/");
            }
        }
    }
}