package day36;

public class Employee extends Accounting{


    public static void main(String[] args) {

        Employee emp1= new Employee();
        // emp1 Employee class'ının objesi olmasına rağmen parent classlar
        // olan staff ve accounting verilerini kullanabilir

        // staff class
        emp1.stnum=1001;
        emp1.name="Saldıray";
        emp1.surName="DURGUN";
        emp1.adress="Unkapanı";
        emp1.phoneNumber="3141592";

        // accounting class
        emp1.hrWage=44;
        emp1.status="yapımcı";
        emp1.accountWage();
        System.out.println(emp1);
        System.out.println(emp1.wage);

    }
    @Override
    public String toString() {
        return "Employee{" +
                "hrWage=" + hrWage +
                ", status='" + status + '\'' +
                ", wage=" + wage +
                ", stnum=" + stnum +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", adress='" + adress + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

}
