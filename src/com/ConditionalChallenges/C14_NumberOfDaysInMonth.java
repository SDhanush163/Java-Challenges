package com.ConditionalChallenges;

/*--------------------------------------------------------------------------------------------------
Computing Month Length With Leap Year Consideration
Write a method isLeapYear with a parameter of type int named year.

The parameter needs to be greater than or equal to 1 and less than or equal to 9999. If the parameter
is not in that range return false. Otherwise, if it is in the valid range, calculate if the year is
a leap year and return true if it is, otherwise return false. A year is a leap year if it is
divisible by 4 but not by 100, or it is divisible by 400.

Examples of input/output:
isLeapYear(-1600); →  should return false since the parameter is not in the range (1-9999)
isLeapYear(1600); → should return true since 1600 is a leap year
isLeapYear(2017); → should return false since 2017 is not a leap year
isLeapYear(2000); → should return true because 2000 is a leap year

​NOTE:  The solution to the Leap Year coding exercise earlier in the course created
the isLeapYear method. You can use that solution if you wish.

Write another method getDaysInMonth with two parameters month and year.  ​Both of type int.
If parameter month is < 1 or > 12 return -1. ​
If parameter year is < 1 or > 9999 then return -1.
This method needs to return the number of days in the month. Be careful about leap years they have
29 days in month 2 (February).

You should check if the year is a leap year using the method isLeapYear described above.

Examples of input/output:
getDaysInMonth(1, 2020); → should return 31 since January has 31 days.
getDaysInMonth(2, 2020); → should return 29 since February has 29 days in a leap year
                            and 2020 is a leap year.
getDaysInMonth(2, 2018); → should return 28 since February has 28 days if it's not a leap year and
                            2018 is not a leap year.
getDaysInMonth(-1, 2020); → should return -1 since the parameter month is invalid.
getDaysInMonth(1, -2020); → should return -1 since the parameter year is outside the range [1, 9999]

HINT: Use the switch statement.
NOTE: Methods isLeapYear and getDaysInMonth need to be public static like we
have been doing so far in the course.
--------------------------------------------------------------------------------------------------*/

public class C14_NumberOfDaysInMonth {
    public static void main(String[] args) {
        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(1, -2020));
    }

    public static boolean isLeapYear(int year) {
        if (year <= 0 || year >= 10000) return false;

        boolean isLeapYear = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }

        return isLeapYear;
    }

    public static int getDaysInMonth (int month, int year) {
        if (year <= 0 || year >= 10000) return -1;
        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 2 -> {
                yield isLeapYear(year) ? 29 : 28;
            }
            case 4, 6, 9, 11 -> 30;
            default -> -1;
        };
    }
}
