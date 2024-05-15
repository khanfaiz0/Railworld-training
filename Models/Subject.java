package Models;

public class Subject {
    String subName;
    int marks;

    public Subject(int marks, String subName) {
        this.marks = marks;
        this.subName = subName;
    }

    public Subject() {
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subName='" + subName + '\'' +
                ", marks=" + marks +
                '}';
    }
}
