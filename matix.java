import java.util.Arrays;
import java.util.Scanner;

public class matix {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.println("please enter columns and rows");
        int colum = sc.nextInt();
        int row = sc.nextInt();

        int mat[][] = new int[row][colum];
        System.out.println("enter matrics values");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                mat[i][j] = sc.nextInt();

            }
        }
        System.out.println(Arrays.deepToString(mat));
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                if(i == j || i+j == row-1){
                    System.out.print(mat[i][j]+" ");
                }
                else{
                    System.out.print("  ");
                }

            }
            System.out.println();

        }


    }
}
