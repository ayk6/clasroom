package lambda;

public class University {

    private String university;
    private String department;
    private int studentCount;
    private int average;

    public University() {
    }

    public University(String university, String department, int studentCount, int average) {
        this.university = university;
        this.department = department;
        this.studentCount = studentCount;
        this.average = average;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    public int getAverage() {
        return average;
    }

    public void setAverage(int average) {
        this.average = average;
    }

    @Override
    public String toString() {
        return "University{" +
                "university='" + university + '\'' +
                ", department='" + department + '\'' +
                ", studentCount=" + studentCount +
                ", average=" + average +
                '}';
    }
}
