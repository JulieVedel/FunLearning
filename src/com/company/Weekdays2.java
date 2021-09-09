package com.company;

public class Weekdays2 {

    public static void main(String[] arg) {
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        for (int i = 0; i < weekdays.length; i++) {
            
            if (weekdays[i] == "Sunday" || weekdays[i] == "Saturday") {
              System.out.println("Today it is " + weekdays[i] + "! And it's a free day!");
            }

            else {
                System.out.println("Today it is " + weekdays[i] + "!");
            }
        }
    }
}
