package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
/*
 Exercicio 1 		
		Rectangle rect = new Rectangle();
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rectangle width and height:");
		rect.width = sc.nextDouble();
		rect.height = sc.nextDouble();
		System.out.printf("AREA = %.2f\n", rect.area());
		System.out.printf("PERIMETER = %.2f\n", rect.perimeter());
		System.out.printf("DIAGONAL = %.2f\n", rect.diagonal());
		sc.close();

 Exercicio 2
		Employee emp = new Employee();
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Name: ");
		emp.name = sc.nextLine();
		System.out.print("Gross salary: ");
		emp.salary = sc.nextDouble();
		System.out.print("Tax: ");
		emp.tax = sc.nextDouble();
		System.out.println("Employee: " + emp);  //invoca o metodo toString()
        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        emp.increaseSalary(percentage);
        System.out.println("Updated data: " + emp);
        
		sc.close();

	
	
	Exercicio 3
		Student stdnt = new Student();
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		stdnt.name = sc.nextLine();
		stdnt.nota1 = sc.nextDouble();
		stdnt.nota2 = sc.nextDouble();
		stdnt.nota3 = sc.nextDouble();
		System.out.println(stdnt);
		sc.close();
		
		*/
		// Exercicio 4
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		List<Employee> listEmployee = new ArrayList<>();
		for (int i=0; i<n; i++) {
			System.out.println("Employee #" + (i+1));
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			listEmployee.add(new Employee(id, name, salary));
		}
		System.out.println("");
		System.out.print("Enter the employee id that will have salary increase : ");
		int id = sc.nextInt();

		/*for ( Employee list : listEmployee ) {
			if ( list.getId() == id ) {
			    list.increaseSalary(percentage);
			}
		}*/
		Employee emp = listEmployee.stream().filter(x->x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}
		System.out.println("");
		System.out.println("List of employees:");
		for ( Employee list : listEmployee ) {
			System.out.println(list);
		}
		sc.close();
	}
}
