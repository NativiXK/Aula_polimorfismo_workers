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

		boolean exit = false;
		do {

			messages.cls();
			System.out.print(messages.grettingsMenu());
			System.out.print("Command: ");
			int command = sc.nextInt();

			switch (command) {

			case 1: {
				messages.cls();
				massAdditionEmployees(1, employee, sc);
				break;
			}

			case 2: {
				messages.cls();
				removeEmployee(employee, sc);
				break;
			}

			case 3: {
				messages.cls();
				System.out.println("Enter the number of employees: ");
				int amount = sc.nextInt();
				massAdditionEmployees(amount, employee, sc);

				break;
			}

			case 4: {
				messages.cls();

				break;
			}

			case 5: {
				System.out.print("Insert the employee name: ");
				String name = sc.next();
				employee.searchByName(name);
				break;
			}
			case 6: {
				messages.cls();
				System.out.println("EXITED");
				exit = true;
				break;
			}

			}

		} while (exit == false);
		sc.close();
	}

	public static void massAdditionEmployees(int amount, EmployeeWallet employee, Scanner sc) {
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
			source = source.toUpperCase();

			if (source.charAt(0) == 'Y') {
				System.out.println("Additional charge: ");
				double addCharge = sc.nextDouble();
				employee.addEmployee(new OutsourcedEmployee(name, hours, value, addCharge));
			} else {
				employee.addEmployee(new Employee(name, hours, value));
			}
			System.out.println();
		}
	}

	public static void removeEmployee(EmployeeWallet employee, Scanner sc) {
		System.out.print("Insert the employee name: ");
		String name = sc.next();

		Employee match = employee.searchByName(name);
		System.out.println(match.resume());
		System.out.print("Do you want to remove? (Y / N): ");
		String choice = sc.next();
		choice = choice.toUpperCase();
		
		if (choice.charAt(0) == 'Y') {
			employee.removeEmployee(match);
		}
		
	}

}
