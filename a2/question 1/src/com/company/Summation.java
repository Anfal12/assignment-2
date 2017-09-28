package com.company;

public class Summation {

    private int i;
    private int j;

    public Summation(int a,int b){
        this.i=a; // Current Instance
        this.j=b;
    }
    int summat(int a,int b) {
        int c = 0;
        int sum = a;

        if (b > a) {
            for (int i = 1; i < (b - a) + 1; i++) {
                c = a + i;
                sum = sum + c;
            }
                    }


        else {
            for (int i = 1; i < (a - b) + 1; i++) {
                c = a - i;
                sum = sum + c;
            }
        }
        return sum;

    }

}
