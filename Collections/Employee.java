package Collections;

public class Employee {
    private int eId;
    private String eName;
    private String position;

    public Employee(int eId, String eName, String position) {
        this.eId = eId;
        this.eName = eName;
        this.position = position;
    }

    public int geteId() {
        return eId;
    }

    public String geteName() {
        return eName;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eId=" + eId +
                ", eName='" + eName + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
