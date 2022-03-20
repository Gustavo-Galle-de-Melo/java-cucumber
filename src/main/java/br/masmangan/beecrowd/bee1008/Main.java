package br.masmangan.beecrowd.bee1008;

import java.util.Scanner;

import static java.lang.System.out;

public class Main {

    private Main() {

    }

    public static void main(String[] args) {
        Salary salary;
        Scanner in;

        salary = new Salary();
        in = new Scanner(System.in);

        salary.setNumber(in.nextInt());
        salary.setHours(in.nextInt());
        salary.setAmountPerHour(in.nextDouble());

        in.close();

        out.print("NUMBER = "+salary.getNumber()+"\n");
        out.printf("SALARY = U$ %.2f\n", salary.getSalary());
    }
}