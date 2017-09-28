package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        for(;;){
            Scanner ab=new Scanner(System.in);
            CPUTimer object;
            System.out.println(" Select one option only :[a,b,c]");
            char ch=ab.next().charAt(0);
            if(ch=='a') {
                System.out.println("Enter instruction count");
                int m = ab.nextInt();

                System.out.println("Cycles per instruction");
                int n = ab.nextInt();

                System.out.println("Speed of clock in MHz");
                int o = ab.nextInt();

                object = new CPUTimer(m, n, o);

                System.out.println("the seconds per program are " + object.getSec());
            }
            else if(ch=='b') {
                System.out.println("Enter instruction count");
                int m = ab.nextInt();
                System.out.println("Enter seconds per instruction");
                int n = ab.nextInt();
                object = new CPUTimer(m , n);
                System.out.println("the seconds per program are " + object.getSec());
            }
            else if(ch=='c'){
                System.exit(0);

            }
            System.out.println("want to rerun the program  yes or no");
            char A=ab.next().charAt(0);
            if(A=='n'){
                System.exit(0);
            }


        }

    }

}

