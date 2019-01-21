package entities;

import java.util.ArrayList;
import java.util.List;

public final class EmployeeWallet {

	List<Employee> employees = new ArrayList<>();

	public List<Employee> getEmployees() {
		return employees;
	}

	public void addEmployee(Employee employee) {
		this.employees.add(employee);
	}

	public void removeEmployee(Employee employee) {
		this.employees.remove(employee);
	}

	public Employee searchByName (String name) {
		Employee match = null;
		for (Employee emp : employees) {
			if (emp.getName() == name) {
				match = emp;
				continue;
			}
		}
		return match;
	}

}
