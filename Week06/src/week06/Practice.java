package week06;

public class Practice {

	public static void main(String[] args) {
		int[] ints = {3,4,2,1,6,3,5,2,7,1,77,33,44,66};
		
		//Print un-sorted
		for(int i = 0; i<ints.length; i++) {
			System.out.println(ints[i]);
		}
		
		//Sort
		SelectionSort.sortNow(ints);
		
		//Print sorted
		for(int i = 0; i<ints.length; i++) {
			System.out.println(ints[i]);
		}
	}
}
