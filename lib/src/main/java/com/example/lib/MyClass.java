package com.example.lib;

import java.util.Scanner;

public class MyClass {

    public static void main ( String[] args ) {
        int a=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the AD year");
        a = scanner.nextInt();
        if(a%4!=0)
            System.out.print("leap year:NO");
        else if(a%100!=0)
            System.out.print("leap year:Yes");
        else if(a%400!=0)
            System.out.print("leap year:NO");
        else
            System.out.print("leap year:Yes");
    }


}
