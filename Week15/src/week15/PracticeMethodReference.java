package week15;

import java.util.ArrayList;
import java.util.Comparator;

public class PracticeMethodReference {
	
	public static void main(String[] args) {
		ArrayList<Integer> unsorted = new ArrayList<>();
		
		unsorted.add(11);
		unsorted.add(31);
		unsorted.add(3);
		unsorted.add(12);
		
		ArrayList<Integer> sorted = new ArrayList<>();
		
		System.out.println("Unsorted List:\t"+unsorted);
		System.out.println("Sorted List:\t"+sorted);
		
		
	}

	class IntegerCompare implements Comparator<Integer>{
		@Override
		public int compare(Integer o1, Integer o2) {

			if(o1 > o2) {
				return 1;
			}
			if(o1<o2) {
				return -1;
			}
			return 0;
		}//end compare
	}
}
