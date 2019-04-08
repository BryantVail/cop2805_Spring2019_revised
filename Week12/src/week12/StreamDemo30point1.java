package week12;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamDemo30point1 {
	
	public static void main(String[] args) {
		
		String[] names = {
				"John", "Lewie", "Lewis", "Shirley", "Bryant", "Littlejohn", "Julie"
		};
		
		//display the first 4(four) names
		Stream.of(names).limit(4).sorted().forEach(e -> System.out.print(e+ " "));
		
		System.out.println(); 
		
		//skip 4 names, and display the rest 'sorted' ignore case (<- which 'ignores' the upper/lower case of the String
		Stream.of(names).skip(4).sorted((e1, e2) -> e1.compareToIgnoreCase(e2)).forEach(e -> System.out.print(e + ", "));
		
		System.out.println();
		
		//same as above but with the '::' operator
		Stream.of(names).skip(4).sorted(String:: compareToIgnoreCase).forEach(e -> System.out.print(e + " "));
		
		//Largest string with length > 4
		System.out.println("\nLargest string with length >4: " + Stream.of(names)
			.filter(e -> e.length() > 4)
			.max(String::compareTo)
			.get());
		
		//smallest String Alphabetically
		System.out.println("Smallest String alphabetically: "+ Stream.of(names)
			.min(String::compareTo).get());
		
		//"Stacy" in names? 
		System.out.println("Stacy in names? " + Stream.of(names)
				.anyMatch(e -> e.equals("Stacy")));
		
		//All names start with a capital letter? 
		System.out.println("All names start with a capital letter? "+ 
				Stream.of(names).allMatch(e -> Character.isUpperCase(e.charAt(0))));
		
		//no name begins with "Ko"?
		System.out.println("No name begins with \"Ko\" "+ 
				Stream.of(names).noneMatch(e -> e.startsWith("Ko")));
		
		
		//Number of distinct case-insensitive strings
		System.out.println("Number of distinct case-insensitive strings: " + 
				Stream.of(names).map(e -> e.toUpperCase()).distinct().count());
		
		//First element in this stream in lowercase
		System.out.println("First element in this stream in lowercase " + Stream.of(names)
			.map(String::toLowerCase).findFirst().get());
		
		System.out.println("Skip 4 and get any element in the Stream: " + Stream.of(names).skip(4).sorted()
				.findAny().get());
		
		
		//last method 
		Object[] namesInLowerCase = Stream.of(names).map(String::toLowerCase).toArray(); 
		System.out.println(Arrays.toString(namesInLowerCase));
		
	}

}
