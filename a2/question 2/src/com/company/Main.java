package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

            Scanner ab=new Scanner(System.in);
            System.out.println("Enter first and second integer : ");
            //System.out.println("Enter second integer ");

            int a=ab.nextInt();
            int b=ab.nextInt();



            Product object= new Product (a,b);
            int z=object.total(a,b);

            System.out.println("the total product of integer from " + a + " and " + b + " is " +z);
        }
    }

