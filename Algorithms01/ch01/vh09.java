package Algorithms01.ch01;

import java.util.Scanner;

public class vh09 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        String sum = "";
        for(int n = s; n > 0; n /= 2)
            sum = (n % 2) + sum ;
        System.out.println(sum);
    }
}
