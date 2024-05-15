package Models;


import java.util.Arrays;
import java.util.Scanner;

public class matricsdiagonals {
    int row;
    int column;
    public matricsdiagonals(int a, int b){
        row = a;
        column = b;
    }
    int a[][] = new int[row][column];
    Scanner sc =  new Scanner(System.in);
    public void diagonal(String args){
        System.out.println("enter elements");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < column; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(a));

    }


}
