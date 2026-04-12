package tutorial;

import java.util.Scanner;

public class thermostat {
    public static void main(String[] args) {

//        Write a program that sets the tutorial.thermostat mode based on the following conditions:
//        If the temperature is less than 18°C:
//        Set mode to "HEAT" if the time of day is "morning" or "evening", else "ECO"
//        If the temperature is between 18°C and 25°C (inclusive):
//        Set mode to "COMFORT" during "morning" or "evening", else "ECO"
//        If the temperature is above 25°C:
//        Set mode to "COOL" during "day" or "afternoon", else "ECO"


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter temperature: ");
        int temperature = scanner.nextInt();

        System.out.println("Enter time of day (morning/afternoon/evening/day)");
        String time = scanner.next();

        String result = "mode";

//        temperature < 18
        String mode = "";
        if (temperature < 18){
            if (time.equals("morning")  || time.equals("evening")){
                mode = "HEAT";
            } else { mode = "ECO";
        }

    }
//        temperature >=18 or <=25

        if (temperature >= 18 || temperature <=25){
            if (time.equals("morning") || time.equals("evening")){
                mode = "COMFORT";
            } else {
                mode = "ECO";
            }
        }

//        temperature > 25
        if (temperature > 25){
            if (time.equals("day") || time.equals("afternoon")){
                mode = "Cool";
            } else {
                mode = "ECO";
            }
        }

        System.out.println("Thermostat mode: " + mode);

        if (temperature == 10) {
                mode = "cold";
        } else {
                mode = "error";
        }
}


}
