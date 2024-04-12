package com.jg;
//Imported java scanner
import java.util.Scanner;

public class PayrollCalc {
    public static void main(String[] args) {
        //Creating scanner
        Scanner scanner = new Scanner(System.in);
        //Declaring variables
        String name;
        float hoursWorked;
        float payRate;
        float grossPay;

        //Asking for user's information
        System.out.println("Enter name: ");
        name = scanner.next();
        System.out.println("Enter hours worked: ");
        hoursWorked = scanner.nextFloat();
        System.out.println("Enter pay rate ");
        payRate = scanner.nextFloat();

        //Calculating user's gross pay, and if they worked overtime
        if(hoursWorked > 40) {
            float overtimeRate = 1.5f;
            grossPay = (hoursWorked * overtimeRate) * payRate;
        }
        else {
            grossPay = hoursWorked * payRate;
        }
        //Display employee's name and gross pay
        System.out.println(name + " gross pay is " + grossPay);
    }
}
