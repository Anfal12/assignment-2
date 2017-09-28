package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {


        Scanner ab=new Scanner(System.in);
        System.out.println("Enter desired number to make table ");
        int x=ab.nextInt();
        ModulusTable obj=new ModulusTable(x,12);
        System.out.println(" ");
        System.out.println( ""+"1"+" "+"2"+" "+"3"+" "+"4"+" "+"5"+" "+"6"+" "+"7"+" "+"8"+" "+"9"+" "+"10"+" "+"11"+" "+"12");

        for(int k=1 ; k<13; k++){

            System.out.print(k+" ");

            for(int l=1; l<13; l++){

                System.out.print(obj.toString(k , x, l )+" ");
            }
            System.out.println();
        }

    }
    }

