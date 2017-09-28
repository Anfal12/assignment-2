package com.company;

public class Product {

            private int i,j;
        public Product (int a,int b){
            this.i=a;
            this.j=b;
        }
        int total(int a,int b) {

            int ac = 0;
            int p = a;
            if (b > a) {
                for (int j = 1; j < (b - a) + 1; j++) {

                    ac = a + i;
                    p = p * ac;
                }
            }
            else { //incase user enters the bigger variable in the beginning
                for (int k = 1; k < (a - b) + 1; k++) {
                    ac = a - i;
                    p = p * ac;
                }
            }
            return p;

        }
}
