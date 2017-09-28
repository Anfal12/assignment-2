package com.company;

public class ModulusTable {

    private int m; //2 modulus private data. where m=modulus and t=tablesize
    private int t;

    public ModulusTable(int m,int t) {
        this.m=m;
        this.t=t;
    }

    public String toString(int k,int number,int l){
        return ""+((k*l)%number);
    }
}
