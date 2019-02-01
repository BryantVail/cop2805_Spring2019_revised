package week04_Sets_and_Maps;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet {

	public static void main(String[] args) {
		// create hashset
		Set<String> set = new HashSet<>();
		
		//add strings
		set.add("Birmingham");
		set.add("Orlando");
		set.add("Charlotte");
		set.add("Alexandria");
		set.add("Boston");
		set.add("Orlando");
		
		for(String s: set) {//foreach String s :of: set
			System.out.print(s.toUpperCase() + " ");
		}
		
		System.out.println();
		
		set.forEach(e -> System.out.println(e.toLowerCase() + " "));
		
		
	}//end main
	
	

}
