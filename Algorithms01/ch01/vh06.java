package Algorithms01.ch01;

public class vh06 {
    public static void main(String[] args) {

        int f = 0;
        int g = 1;
        for(int i = 0; i <=15; i++) {
            f = f + g;
            g = f - g;
            System.out.println(f);
        }
    }
}
