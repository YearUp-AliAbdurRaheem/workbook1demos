package com.pluralsight;

public class Demo1 {

    public static void main(String[] args){
        System.out.println("Hello World!");


        char status;
        int indeetifier = 1;
        String name = "Ali";


        String greeting = "Hello " + name;

        int numberOfDaysPerWeekWatchesTV = 5;
        int minutesPerDayOnTVWatchedOnAverage = 70;
        int minutesPerWeek = numberOfDaysPerWeekWatchesTV * minutesPerDayOnTVWatchedOnAverage;
        int minuetsPerYear = minutesPerWeek * 52;

        int hoursPerYear = minuetsPerYear / 60;

        int hoursInWorkWeek = 35;

        int woorkWeeksPerYearWatchingTV = hoursPerYear / hoursInWorkWeek;

        System.out.println("If " + name + " did not watch TV, it would be like a " + woorkWeeksPerYearWatchingTV + " week vacation every year!");

        System.out.println(greeting);

    }
}
