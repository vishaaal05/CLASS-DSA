import java.util.Scanner;

class SumOfMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the matrix A ");
        int rowOfMatrixA = sc.nextInt();
        int colOfMatrixA = sc.nextInt();

        System.out.println("Enter the size of the matrix B ");
        int rowOfMatrixB = sc.nextInt();
        int colOfMatrixB = sc.nextInt();

        if (rowOfMatrixA!=rowOfMatrixB || colOfMatrixA!=colOfMatrixB) {
            System.out.println("Size of the matrix should be equal");
          return;
        }
        System.out.println("Enter the value of the Matrix A");

        int[][] a = new int[rowOfMatrixA][colOfMatrixA];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = sc.nextInt();
            }
        }
       
        System.out.println("Enter the value of the Matrix B");
        int[][] b = new int[rowOfMatrixB][colOfMatrixB];

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        int[][] sum = new int[rowOfMatrixA][colOfMatrixA];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("The sum of the matrix A and matrix B");
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum.length; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }

    }
}