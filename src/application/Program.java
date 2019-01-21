package application;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.EmployeeWallet;
import entities.OutsourcedEmployee;
import show.Messages;

public class Program {

	public static void main(String[] args) throws IOException, InterruptedException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		EmployeeWallet employee = new EmployeeWallet();
		Messages messages = new Messages();
		
		System.out.println(messages.grettingsMenu());
		int command = sc.nextInt();
		
		switch (command) {
		
		case 1 : {
			
			break;
		}
		
		case 2 : {
			
			break;
		}
		
		case 3 : {
			messages.cls();
			System.out.println("Enter the number of employees: ");
			int amount = sc.nextInt();
			massAdditionEmployees(amount, employee, sc);
			
			break;
		}
		
		case 4 : {
			
			break;
		}
		
		case 5 : {
			break;
		}
		
		
		}
		

		

		

		sc.close();
	}
	
	public static void massAdditionEmployees (int amount, EmployeeWallet employee, Scanner sc) {
		for (int i = 0; i < amount; i++) {
			System.out.print("Outsourced? (Y / N): ");
			String source = sc.next();
			System.out.println("Enter the #" + (i + 1) + " employee data: ");
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double value = sc.nextDouble();

			if (source.charAt(0) == 'Y' || source.charAt(0) == 'y') {
				System.out.println("Additional charge: ");
				double addCharge = sc.nextDouble();
				employee.addEmployee(new OutsourcedEmployee(name, hours, value, addCharge));
			} else {
				employee.addEmployee(new Employee(name, hours, value));
			}
		}
	}

}
