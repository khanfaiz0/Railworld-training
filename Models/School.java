package Models;


public class School {
    String SchoolName;
    int scRank;

    public School(String schoolName, int scRank) {
        SchoolName = schoolName;
        this.scRank = scRank;
    }

    public School() {
    }


    public String getSchoolName() {
        return SchoolName;
    }

    public void setSchoolName(String schoolName) {
        SchoolName = schoolName;
    }

    public int getScRank() {
        return scRank;
    }

    public void setScRank(int scRank) {
        this.scRank = scRank;
    }

    @Override
    public String toString() {
        return "School{" +
                "SchoolName='" + SchoolName + '\'' +
                ", scRank=" + scRank +
                '}';
    }
}
