package com.company;

public class CPUTimer {
    private int ic; //ic=IC instruction count
    private Double ips; // ips = instruction per second

    public CPUTimer(int Ic, int cyclesPERins, int cyclesPERsec){
        this.ic=ic;
        this.ips=(double)cyclesPERsec*1000000;
        ips=ips/cyclesPERins;
    }

    public CPUTimer(int iC, int InsPerSec) //methods having parameters
    {
        this.ic=iC;
        this.ips=(double)InsPerSec;
    }

    // returns the instruction count as stored in the object
    int getIC() //method
    {
        return ic;
    }
    // returns the  instruction per sec
    double getspi()//method where getspi=getSPI
    {

        double x=1/ips;
        return x;
    }

    // returns the seconds per program
    double getSec(){

        return ic*getspi();
    }

}