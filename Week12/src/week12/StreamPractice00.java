package week12;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class StreamPractice00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Double[] numbers = {2.4, 55.6, 90.12, 26.6};
		Set<Double> set = new HashSet<>(Arrays.asList(numbers));
		
		//method without stream
		int count = 0;
		for(double e: set) {
			if(e>60) {
				count++;
			}
		}
		System.out.println("Count is " + count);
		
		//space
		System.out.println();
		
		//Re-Write of what is above
		System.out.println("Count is " + set.stream().filter(e -> e > 60).count());
		
		Set setForStreamMethod = new HashSet<Integer>();
		
		setForStreamMethod.add(1);
		setForStreamMethod.add(3);
		setForStreamMethod.add(2);
		setForStreamMethod.add(5);
		setForStreamMethod.add(4);
		setForStreamMethod.add(1);
		setForStreamMethod.add(3);
		setForStreamMethod.add(2);
		setForStreamMethod.add(5);
		setForStreamMethod.add(9);
		
		setForStreamMethod.add(1);
		setForStreamMethod.add(1);
		setForStreamMethod.add(3);
		setForStreamMethod.add(2);
		setForStreamMethod.add(5);
		setForStreamMethod.add(4);
		setForStreamMethod.add(1);
		setForStreamMethod.add(3);
		setForStreamMethod.add(2);
		setForStreamMethod.add(5);
		
		setForStreamMethod.add(2);
		setForStreamMethod.add(1);
		setForStreamMethod.add(3);
		setForStreamMethod.add(2);
		setForStreamMethod.add(5);
		setForStreamMethod.add(4);
		setForStreamMethod.add(2);
		setForStreamMethod.add(1);
		setForStreamMethod.add(3);
		setForStreamMethod.add(2);
		
		setForStreamMethod.add(2);
		setForStreamMethod.add(1);
		setForStreamMethod.add(3);
		setForStreamMethod.add(2);
		setForStreamMethod.add(5);
		setForStreamMethod.add(4);
		setForStreamMethod.add(2);
		setForStreamMethod.add(1);
		setForStreamMethod.add(2);
		setForStreamMethod.add(2);
		
		
		
		
		long counted = setForStreamMethod.stream().limit(25).distinct().count();
		System.out.println(counted);
		System.out.println(setForStreamMethod.stream().limit(25));
		System.out.println(setForStreamMethod.stream().limit(25).distinct());
		System.out.println(setForStreamMethod.stream().limit(25).distinct().count());
		

	}

}
