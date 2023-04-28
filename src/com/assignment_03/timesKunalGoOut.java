package com.assignment_03;

import java.util.Scanner;

public class timesKunalGoOut {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Enter name of month: ");
        String month_name = input.next();
        int days = 0;
        //switch case with months
        switch (month_name) {
            case "jan","mar","may","jul","aug","oct","dec":
                days = 31;
                break;
            case "apr","jun","sept","nov":
                days = 30;
                break;
            case "feb":
                days = 28;
                break;
            default:
                System.out.printf("Enter correct month name: ");
                break;
        }

        //check with number of days
        int times = 0;
        for (int i = 1; i <= days; i++) {
            if (i%2 == 0){
                times++;
            }
        }
        System.out.printf("No. of times Kunal went out: "+times);
    }
}
