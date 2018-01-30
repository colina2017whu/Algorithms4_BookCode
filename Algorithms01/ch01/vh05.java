package Algorithms01.ch01;

import java.util.Scanner;

public class vh05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            if (x > 0 && x < 1 && y > 0 && y <1) {
                System.out.println("true");
            }
            else System.out.println("false");
        }
    }
}
