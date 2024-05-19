package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrList {
    public static void main(String[] args){
       ArrayList<Employee> ls1= new ArrayList<>();

       Employee e1 = new Employee(12,"faizan","jr dev");
        Employee e2 = new Employee(13,"adnan","sr dev");
        ls1.add(e1);
        ls1.add(e2);
        System.out.println(ls1);
        Collections.sort(ls1,new EmpName());
        System.out.println(ls1);
        for(Employee e:ls1){
            System.out.println(e);
        }
    }
}
