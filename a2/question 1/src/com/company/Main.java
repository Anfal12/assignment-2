package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ab=new Scanner(System.in);

        System.out.println("Enter first integer");
        int a=ab.nextInt();
        System.out.println("Enter second integer ");
        int b=ab.nextInt();


        Summation object=new Summation(a,b);
        int z=object.summat(a,b);
        System.out.println("the total sum of " + a + "and " + b + " is " + z);
    }

}

