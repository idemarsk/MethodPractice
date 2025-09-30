package com.pluralsight;

public class SwitchStatement {
    public static void main(String[] args) {


        int dayNumber = 0;
        String description = "";
        switch (dayNumber) {
            case 0:
                description = "Sunday";
                break;
            case 1:
                description = "Monday";
                break;
            case 2:
                description = "Tuesday";
                break;
            case 3:
                description = "Wednesday";
                break;
            case 4:
                description = "Thursday";
                break;
            case 5:
                description = "Friday";
                break;
            case 6:
                description = "Saturday";
                break; // optional break -- okay without it
        }

        System.out.println(description);

        //example where is no breaks
        int anotherdayNumber = 23;
        String anotherDescription = "";
        switch (dayNumber) {
            case 0:
            case 6:
                anotherDescription = "Weekend";
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                anotherDescription = "Weekday";
                break;
            default:
                anotherDescription="invalid";
        }

        System.out.println(anotherDescription);

    }
}
