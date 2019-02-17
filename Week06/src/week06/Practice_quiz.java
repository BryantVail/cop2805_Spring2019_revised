package week06;

import java.util.ArrayList;
import java.util.Arrays;

public class Practice_quiz {

	public static void main(String[] args) {
		// 
		
		ArrayList<Integer> intsHeap = new ArrayList<>(Arrays.asList(64,42,59,32,39,44));
//		boolean going  = true;
		for(int i=0;i<intsHeap.size(); i++) {
			System.out.println("the index " + i + " of value\t"+intsHeap.get(i)+" is less than its parent index "+ findParentIndex(intsHeap, i)+ ": of value\t" + intsHeap.get(findParentIndex(intsHeap, i)) +"\t" + checkHeapIndex(intsHeap, i));
		}
		

	}
	
	public static boolean checkHeapIndex(ArrayList<Integer> array, int index) {
		
		if(index == 0) {
			return true;
		}
		else if (array.get(index) > array.get(findParentIndex(array, index))) {
			return false;
		}
		else {
			return true;
		}
	}

	private static int findParentIndex(ArrayList array, int index) {
		//checks indexes above 0(zero) for their parent value
		if(index == 0) {
			return 0;
		}
		if(index%2 == 0) {
			return (index -2)/2;
		}else {
			return (index -1)/2;
		}
		
	}

}
