package com.company.Abdi;

public class Main {
// Mubarik Abdi 1/23/2020
    public static void main(String[] args) {


        int[] highTemp = {45, 29, 10, 22, 41, 28, 33};
        int[] rain = {95, 60, 25, 5, 0, 75, 90};
        String[] day = {"Sunday", "Monday", "tuesday", "wednesday", "thursday", "friday", "saturday"};

        // loops for each day
        for (int i=0; i< day.length ; i++){

            // checks weather
            if ((highTemp[i] <= 32) && (rain[i] > 50)) {
                System.out.println(day[i] + " :It will snow");
            }else{     //displays day and weather
                System.out.println(day[i] + ": It won't snow");
            }

        }





    }
}
