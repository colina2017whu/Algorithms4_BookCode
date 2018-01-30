package Algorithms01.ch01;

public class vh10 {
    public static void main(String[] args) {
        int[] a;
        a = new int[20];
        for(int i = 0;i < 10; i++)
            a[i] = i * i;

        for(int i = 0;i < 10; i++){
            System.out.print(a[i] + " ");
        }
    }
}
