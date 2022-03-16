package br.masmangan.beecrowd.bee1008;
import java.io.IOException;
import java.util.*;
 
public class Salary {

    private int number;
    private int hours;
    private double amountPerHour;

    public void setNumber(int number){
        this.number=number;
    }

    public void setHours(int hours){
        this.hours=hours;
    }

    public void setAmountPerHour(double amountPerHour){
        this.amountPerHour=amountPerHour;
    }

    public int getNumber(){
        return number;
    }

    public double getSalary(){
        return hours*amountPerHour;
    }
}