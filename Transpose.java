import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the matrix");
        int row = sc.nextInt();
        int col  = sc.nextInt();

        int [][] matrix = new int[row][col];

        System.out.println("Enter the value of the matrix");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<row; i++){
            for(int j=i+1; j<col; j++){
             int temp = matrix[i][j];
             matrix[i][j] = matrix[j][i];
             matrix[j][i] = temp;
            }
        }

        System.out.println("Transpose Of the given matrix");

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
