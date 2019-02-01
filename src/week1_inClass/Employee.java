package week1_inClass;

import java.util.ArrayList;

/**
 * 
 * Employee class representing Employees, deriving from Person
 * @author BVAIL
 *
 */

public class Employee {
	
	String 				position;
	String 				name;
	int 				salary;
	ArrayList<Employee>	team;
	
	/**
	 * 
	 * @param position
	 * @param name
	 * @param salary
	 * @param team
	 */
	public Employee(String position, String name, int salary, ArrayList<Employee> team) {
		this.position = position;
		this.name = 	name;
		this.salary =	salary;
		this.team = 	team;
		
	}
	
	/**
	 * @return Descriptive String showing 'name (position, salary ) [team]
	 */
	@Override
	public String toString() {
		return this.name + " (" + this.position + ", " + salary + " )" + "[ " + this.team + " ]";
	}
	
	/**
	 * @return print the tree of subordinates/team members from top to bottom 
	 * @
	 */
	public void printTree() {
		if(this.team != null) {
			for(int i = 0; i<team.size(); i++) {
				((Employee) team.get(i)).printTree();
			}
		}
//		System.out.println(this);
		
//		for(Employee child : team) {
//			child.printTree();
//		}
	}//end printTree

}
