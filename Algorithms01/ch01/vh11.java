package Algorithms01.ch01;

public class vh11 {
    public static void printBooleanMatrix(boolean[][] matrix) {
//        System.out.print(' ');
//        for (int i = 0; i < matrix[0].length; i++) {
//            System.out.print(i);
//        }
//        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(i + "," + j + (matrix[i][j] ? '*' : ' ') + "   ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        boolean[][] a = { { true, false, true }, { false, true, false },
                { true, true, false } };
        printBooleanMatrix(a);
    }
}
