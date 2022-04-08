package day36;

public class Accounting extends Staff{
    protected int hrWage;
    protected String status;
    protected int wage;

    protected int accountWage(){
        wage =hrWage*8*30;
        return wage;
    }

}
