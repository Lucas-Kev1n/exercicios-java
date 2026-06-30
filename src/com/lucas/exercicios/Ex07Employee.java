package com.lucas.exercicios;

import com.lucas.estruturas.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Ex07Employee {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.println("Enter name, gross salary and tax: ");
         employee.name = sc.nextLine();
         employee.grossSalary = sc.nextDouble();
         employee.tax = sc.nextDouble();

        System.out.println("Employee: " + employee);

        System.out.println("Which percentage to increase salary: ");
        employee.increaseSalary(10.0);
        System.out.println("Updated data: " + employee);

        sc.close();





    }

}
