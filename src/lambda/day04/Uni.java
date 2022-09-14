package lambda.day04;

public class Uni {
    // str üniv, str bölüm, , int öğr sayısı, int notOrt olan
    // pojo classtan 5 farklı liste oluştur
    // ( plain old java object )

    String uni;
    String department;
    int students;
    int avGrade;

    public String getUni() {
        return uni;
    }

    public void setUni(String uni) {
        this.uni = uni;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getStudents() {
        return students;
    }

    public void setStudents(int students) {
        this.students = students;
    }

    public int getAvGrade() {
        return avGrade;
    }

    public void setAvGrade(int avGrade) {
        this.avGrade = avGrade;
    }

    public Uni(String uni, String department, int students, int avGrade) {
        this.uni = uni;
        this.department = department;
        this.students = students;
        this.avGrade = avGrade;
    }

    public Uni() {
    }

    @Override
    public String toString() {
        return "Uni{" +
                "uni='" + uni + '\'' +
                ", department='" + department + '\'' +
                ", students=" + students +
                ", avGrade=" + avGrade +
                "}\n";
    }
}
