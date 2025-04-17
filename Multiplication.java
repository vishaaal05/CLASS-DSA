import java.util.Scanner;

public class Multiplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of matrix A");
        int rowOfMatrixA = sc.nextInt();
        int colOfMatrixA = sc.nextInt();

        System.out.println("Enter the size of matrix B");
        int rowOfMatrixB = sc.nextInt();
        int colOfMatrixB = sc.nextInt();

        if(colOfMatrixA!=rowOfMatrixB){
            System.out.println("Col of matrix A should be equal to the row of the matrix B");
        return;
        }

        System.out.println("Enter the value of the Matrix A");

        int[][] a = new int[rowOfMatrixA][colOfMatrixA];

        for (int i = 0; i < rowOfMatrixA; i++) {
            for (int j = 0; j < colOfMatrixA; j++) {
                a[i][j] = sc.nextInt();
            }
        }
       
        System.out.println("Enter the value of the Matrix B");
        int[][] b = new int[rowOfMatrixB][colOfMatrixB];

        for (int i = 0; i < rowOfMatrixB; i++) {
            for (int j = 0; j < colOfMatrixB; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        int [][] result = new int [rowOfMatrixA][colOfMatrixB];

        for(int i = 0; i < rowOfMatrixA; i++) {
            for(int j = 0; j < colOfMatrixB; j++) {
                for(int k = 0; k < colOfMatrixA; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        

        System.out.println("The Multiplication of the matrix A and matrix B");
        for (int i = 0; i < rowOfMatrixA; i++) {
            for (int j = 0; j < colOfMatrixB; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }
}
