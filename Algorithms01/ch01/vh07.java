package Algorithms01.ch01;

public class vh07 {
    public static void main(String[] args) {
//        double t = 9.0;
//        while(Math.abs(t - 9.0/t) > .001) {
//            t = ( 9.0/t + t )/ 2.0;
//        }
//        System.out.println("%.3f\n", t );


        int sum = 0;
        for( int i = 1; i < 10; i++) {
            for( int j = 1; j < i; j++) {
                sum++;
                System.out.print(j + " ");
            }
            System.out.print("\n");
        }
        System.out.println(sum);


    }
}
