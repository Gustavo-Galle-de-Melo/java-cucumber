package br.masmangan.beecrowd.bee1008;
import java.io.IOException;
import java.util.*;
 
public class Salary {
 
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int hours = in.nextInt();
        double amountPerHour = in.nextDouble();
        System.out.println("NUMBER = "+number);
        System.out.printf("SALARY = %.2f\n", hours*amountPerHour);
 
    }
 
}