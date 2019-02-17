package week06;

public class SelectionSort extends AbstractSort{
	
	private int[] list;

	
	public SelectionSort(int[] list) {
		super("Selection Sort", list);
		this.list = list; 
		
	}
	
	//selection sort
	public void sort() {
		int min = 0;
		
		//outer loop, holding the 'start' of the list
		for(int i =0; i< list.length-1; i++) {
			min = i;
			
			//inner loop: finding the minimum on each pass
			for(int j = i+1; j<list.length; j++) {
				if(list[j]< list[min]) {
					min = j;
				}
			}
			//found minimum, now swap it to the front of the list
			//where min == i at the beginning of the loop
			swap(list, min, i);
			
		}
	}
	
	//selection sort
	public static int[] sortNow(int[] array) {
		int min = 0;
		//outer loop
		for(int i =0; i<array.length -1; i++) {
			min = i;
			
			//inside loop
			for(int j = i+1;j< array.length; j++) {
				if(array[j]< array[min]) {
					min = j;
					
				}
			}
			//swap minimun found in above loop with the "beginning" of the working
			//set of the array
			swapNow(array, min, i);
		}
		return array;
	}
	
	private void swap(int[] ints, int int1, int int2) {
		int valueHolder;
		valueHolder = ints[int1]; 
		ints[int1] = ints[int2];
		ints[int2] = valueHolder;
	}
	
	private static int[] swapNow(int[] ints, int int1, int int2) {
		int valueHolder;
		valueHolder = ints[int1]; 
		ints[int1] = ints[int2];
		ints[int2] = valueHolder;
		return ints;
	}

}
