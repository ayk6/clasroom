package day24v2;

public class Student {
    // Encapsulation : data hiding

    public String stdName = "kim wexler";
    private String stdId = "1001";
    private double gpa = 2.3;
    private boolean pass = true;

    public String getStdName() {
        return stdName;
    }

    public String getStdId() {
        return stdId;
    }

    public double getGpa() {
        return gpa;
    }

    public boolean isPass() {
        return pass;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setPass(boolean pass) {
        this.pass = pass;
    }
}
