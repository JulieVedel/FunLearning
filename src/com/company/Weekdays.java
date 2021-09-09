package com.company;

import java.util.Calendar;

public class Weekdays {

    public static void main(String[] arg) {
        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DAY_OF_WEEK);

        if (day == 1) {
            System.out.println("Today it is Sunday! And it's a free day!");
        }
        else if (day == 2) {
            System.out.println("Today it is Monday!");
        }
        else if (day == 3) {
            System.out.println("Today it is Tuesday!");
        }
        else if (day == 4) {
            System.out.println("Today it is Wednesday!");
        }
        else if (day == 5) {
            System.out.println("Today it is Thursday!");
        }
        else if (day == 6) {
            System.out.println("Today it is Friday! Time for party!");
        }
        else if (day == 7) {
            System.out.println("Today it is Saturday! And it's a free day!");
        }
    }

}
