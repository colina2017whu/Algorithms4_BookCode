package Algorithms01.ch01;

import java.util.Scanner;

public class vh03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (a == b && a == c) {
                System.out.println("equal");
            }
            else System.out.println("not equal");
        }
    }
}
