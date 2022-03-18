package linkedlists;

import java.util.Scanner;

public class Osagie {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println(addTwoNumbers(10, 78));
        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine();
        System.out.println(message);
    }

    public static int addTwoNumbers (int a, int b){
        return a + b;
    }
}

