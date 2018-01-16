package Generic;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        System.out.println(isLeapYear(year));
    }

    /**
     * @param year
     * @return Checks if a year is leap year or not
     */
    public static String isLeapYear(int year) {

        boolean flag = true;
        if (year % 4 == 0) {
            if (year % 100 == 0 && year % 400 != 0) {
                flag = false;
            }
        } else {
            flag = false;
        }

        return flag == true ? "Is a leap Year" : "Not a leap Year";
    }
}
