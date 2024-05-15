public class Student implements Test, Comparable<Student>{
    String name;
    int marks;
    public Student(String n,int roll){
        name = n;
        marks = roll;
    }
    @Override
    public void display() {
        System.out.println(name);
        System.out.println(marks);
    }

    @Override
    public int compareTo(Student student) {
        if(marks > student.marks){
            return 1;

        }
        else{
            return 0;
        }
    }
}
