package week1_inClass;

import java.util.ArrayList;

public class inClassExample {

	public static void main(String[] args) {
		// 
		//create generic list of employees, and add 4 employees to it,
		//print
		
		ArrayList<Employee> employees = new ArrayList<>();
		
		employees.add(new Employee("HelpDesk", "Bryant Vail", 36400, null));
		employees.add(new Employee("SharePoint Developer", "Scott Black", 40200, null));
		employees.add(new Employee("Senior Developer", "Lewis Vail", 95000, null));
		employees.add(new Employee("Trainer", "Stephanie Feliciano", 52000, null));
		
		for(Employee employee : employees) {
			System.out.println(employee);
		}

	}

}
