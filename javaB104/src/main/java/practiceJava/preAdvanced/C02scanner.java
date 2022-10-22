package practiceJava.preAdvanced;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class C02scanner {
    public static void main(String[] args) {
        // \t tab
        // \n new line
        // \b backspace
        System.out.println("i'll \bdelete \bspaces");

        // task - ask user r and calc area and char perimeter of circle

        Scanner scan = new Scanner(System.in);
        System.out.println("r : ");
        int r = scan.nextInt();

        System.out.println("perimeter : "+(2*3.14*r));
        System.out.println("area : "+ (3.14*Math.pow(r,2)));


    }
}
