package Models;

public class Student {
    String name;
    String id;
    Subject subject;
    School school;

    public Student() {
    }

    public Student(String name, String id, Subject subject,School school) {
        this.name = name;
        this.id = id;
        this.subject = subject;
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", subject=" + subject +
                ", school=" + school +
                '}';
    }
}
