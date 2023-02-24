package org.example;
import java.util.Scanner;

import static alapmuveletek.alapmuveletek.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Kérlek adj meg két egész számot! ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(add (a,b));
        System.out.println(subtract (a,b));
        System.out.println(divide (a,b));
        System.out.println(multiply (a,b));
    }
}