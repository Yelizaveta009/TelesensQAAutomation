package homework.lesson02.two;

import java.util.Scanner;

public class TaskSeventh {
        public static void main(String[] args) {
            if (args.length == 2) {
                int q = Integer.valueOf(args[0]);
                System.out.println("q number = " + args[0]);
                int w = Integer.valueOf(args[1]);
                System.out.println("w number = " + args[1]);
                int div = q / w;
                System.out.println("Result q/w = " + div);
                int last = q % w;
                System.out.println("Result q%w = " + last);
            } else if (args.length > 2 || args.length == 1) {
                System.out.println("Should be 0 or 2 parameters");
            } else {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter q number");
                int q = scanner.nextInt();
                System.out.println("Enter w number");
                int w = scanner.nextInt();
                System.out.println(q);
                System.out.println(w);
                System.out.println("Result q/w");
                int div = q / w;
                System.out.println(div);
                System.out.println("Result q%w");
                int last = q % w;
                System.out.println(last);
            }
        }
}

