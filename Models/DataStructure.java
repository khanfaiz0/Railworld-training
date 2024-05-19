package Models;

import java.util.Arrays;
import java.util.Scanner;

public class DataStructure {
    public static void palindrome(){
        String st1;
        String st2;
        Scanner sc = new Scanner(System.in);

        System.out.println("enter first string");
        st1 = sc.nextLine();
        System.out.println("enter second");
        st2 = sc.nextLine();

        if(st1.length() != st2.length()){
            System.out.println("Not a Anagram strings");
        }

        char[] carr1 = st1.toCharArray();
        char[] carr2 = st2.toCharArray();

        Arrays.sort(carr1);
        Arrays.sort(carr2);

        if(Arrays.equals(carr1,carr2)){
            System.out.println("Anagram Sritngs");
        }
    }

    public static void fact(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number for Factorial");
        int n = sc.nextInt();
        int res = facto(n);
        System.out.println("fatorial of"+n+"is"+res);
    }

    public static int facto(int n){
        if(n<=1){
            return n;
        }
        while(n>1){
            return n*facto(n-1);
        }
        return 1;
    }

    public static void armstrong(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any number");
        int n = 0;
        int number = sc.nextInt();
        int onum = number;
        int remainder ,result=0;

        while (onum != 0) {
            onum /= 10;
            ++n;
        }

        onum = number;
        while (number != 0) {
            remainder = number % 10;
            result += Math.pow(remainder, n);
            number /= 10;
        }
        if(result == onum){
            System.out.println("given number is Armstrong");
        }else{
            System.out.println("Given number is not a Armstrong");
        }
    }

}
