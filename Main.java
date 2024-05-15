
import Models.Subject;
import Models.School;
import Models.matricsdiagonals;

import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);

//        Student student = new Student();
//        System.out.println("enter name");
//        student.setName(sc.nextLine());
//        System.out.println("enter id");
//        student.setId(sc.nextLine());
//        student.setSubject(new Subject(200,"maths" ));
//        student.setSchool(new School("PSIT",6));
//
//        System.out.println(student.toString());
//
//
//        System.out.println("Success");


        //arrays
//        int m = sc.nextInt();
//        int n = sc.nextInt();
//
//        String s1 = new String("faizan");
//        String s2 = "faizan";
//        System.out.println(s2.isEmpty());
//
//
//        int b[][] = new int[m][n];
//        int a[][] = new int[m][n];
//        int result[][] = new int[m][n];
//
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                a[i][j] = sc.nextInt();
//
//            }
//        }
//        System.out.println("enter elements for second array");
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                a[i][j] = sc.nextInt();
//
//            }
//        }
//
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                for (int k = 0; k < n; k++) {
//                     result[i][j] = a[i][k] * b[k][j];
//                }
//
//            }
//        }
//
//        System.out.print(Arrays.deepToString(a));
//        System.out.print(Arrays.deepToString(result));

//        matricsdiagonals mat =  new matricsdiagonals(3,3);
//        mat.diagonal("faiz");
//          Student st = new Student("faizan",45);
//          Student st2 = new Student("farhan",48);
//
//          st.display();
//          if(st.compareTo(st) == 1){
//              System.out.println("Heigher");
//          }else{
//              System.out.println("Less");
//          }

        String st1;
        String st2;

        System.out.println("enter first string");
        st1 = sc.nextLine();
        System.out.println("enter second");
        st2 = sc.nextLine();

        if(st1.length() != st2.length()){
            System.out.println("false");
        }

        char[] carr1 = st1.toCharArray();
        char[] carr2 = st2.toCharArray();

        Arrays.sort(carr1);
        Arrays.sort(carr2);

        if(Arrays.equals(carr1,carr2)){
            System.out.println("Anagram");
        }


    }
}