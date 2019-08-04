package lesson.two;

import java.util.Arrays;

public class TaskEleventh {
    public static void main(String[] args){
        int[] random = new int[10];
        for (int i = 0; i < random.length; i++){
            random[i] = ((int)(Math.random() * (200 + 1)) - 100);
        }
        System.out.println(Arrays.toString(random));
        System.out.print("[");
        for (int i = 0; i < random.length; i++){
            if(i == 9){
                System.out.print(random[i]);
            } else {
                System.out.print(random[i] + ",");
            }
        }
        System.out.println("]");
        int n = 0;
        System.out.print("[");
        while(n < random.length){
            if(n == 9){
                System.out.print(random[n]);
            } else {
                System.out.print(random[n] + ",");
            }
            n++;
        }
        System.out.println("]");
    }
}
