package application;

import java.util.Scanner;

import entities.Employee;



public class course {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		
		System.out.printf("Name: ");
		emp.name = sc.nextLine();
		System.out.println();
		System.out.printf("Gross salary: ");
		emp.grossSalary = sc.nextDouble();
		System.out.println();
		System.out.printf("Tax: ");
		emp.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + emp);
		System.out.println();
		System.out.printf("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		emp.increaseSalary(percentage);
		
		System.out.println();
		System.out.println("Update data: " + emp);
		
		sc.close();
		
	}

}
