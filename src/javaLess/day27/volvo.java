package javaLess.day27;

public class volvo {

    public volvo(){}

    String title = "Volvo";
    String origin = "Sweden";
    String model ;
    String fuel;
    int year ;
    boolean automa=gearType();
    int maxSpeed =maxSpeedM();


    public volvo(String c60, String diesel, boolean b, int i, int i1) {
        model=c60;
        fuel=diesel;
        automa=b;
        year=i;
        maxSpeed=i1;
    }

    private int maxSpeedM() {
        int maxSpeed=0;
        if(automa){
            maxSpeed=240;
        }
        else maxSpeed=200;
        return maxSpeed;
    }


    private boolean gearType() {

        boolean result = false;
        if (automa){}
        else
            result =true;

        return result;
    }
    public  String printt(){
        String carFeatures=title+
                model+origin+fuel+year+automa+maxSpeed;
        return carFeatures;
    }
}
