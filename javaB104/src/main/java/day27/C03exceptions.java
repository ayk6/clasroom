package day27;

public class C03exceptions {
    public static void main(String[] args) throws GradeException {
       printGrades(-1);
       printGrades(50);
       printGrades(110);

        System.out.println(checkName("Walt"));
        System.out.println(checkName("jess"));
    }

    public static void printGrades(int grade) throws GradeException {
        if (grade < 0 || grade > 100) {
            throw new GradeException("grade cannot be <0 or >100");
        } else {
            System.out.println("Grade : " + grade);
        }
    }

    public static boolean checkName(String name){
        if (name.charAt(0)>='A'&&name.charAt(0)<='Z'){
            return true;
        }else throw new IllegalNameException("names must start with a capital letter");
    }
}
