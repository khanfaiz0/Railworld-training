
import Models.DataStructure;
import Models.Subject;
import Models.School;
import Models.matricsdiagonals;

import java.util.Arrays;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.LocalTime;


public class Main {

    public static void digiClock(){
        while(true){
            LocalTime t = LocalTime.now();
            DateTimeFormatter tf = DateTimeFormatter.ofPattern("HH:mm:ss");
            String newtime = t.format(tf);
            System.out.println(newtime);
            try {
                Thread.sleep(1000);
            } catch(Exception e) {
                System.out.println(e);
            }
        }
    }

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

//        DataStructure.palindrome();
//        DataStructure.fact();

//        DataStructure.armstrong();
//        LocalDateTime l  = LocalDateTime.now();
//        DateTimeFormatter d = DateTimeFormatter.ofPattern("hh:mm:ss");
//        String s = l.formate(d);
//        System.out.println(s);
//
//        try{
//            Thread.sleep(1000);
//        }catch (interruptedException e){
//            e.printSlackTrace();
//        }

    }
}