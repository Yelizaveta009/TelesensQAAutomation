package homework.lesson06;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Label label = new Label("Hello");
        Button button = new Button((byte) 1);
        CheckButton checkButton = new CheckButton(987654321);
        RoundButton roundButton = new RoundButton(3.2);
        Component component = new Component(3);
        Component[] components = new Component[]
                {label, button, checkButton, roundButton, component, label, roundButton, component, button, checkButton};

        System.out.println(Arrays.asList(components));

        for (int i = 0; i < components.length; i++)
            (components[i]).draw();

        System.out.println("Экземпляры класса Button и его наследников: ");
        for (int i = 0; i < components.length; i++) {
            if (components[i] instanceof Button) {
                System.out.println((components[i]));
            }
        }
        System.out.println("-------Метод 3D draw---------");
        for (int i = 0; i < components.length; i++)
            (components[i]).draw3D();

    }
}


