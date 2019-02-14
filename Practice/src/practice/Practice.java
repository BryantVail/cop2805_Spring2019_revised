import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {

		int[] numbers = new int[1000];
		for (int i = 0; i < numbers.length; i++)
			numbers[i] = (int) (Math.random() * 1000000);

		printNumbers(numbers);

		Scanner input = new Scanner(System.in);
		System.out.print("Hit enter to sort");
		String line = input.nextLine();

		sortNumbers(numbers);

		printNumbers(numbers);
	}

	private static void printNumbers(int[] numbers) {
		for (int i = 0; i < numbers.length; i++)
			System.out.println(numbers[i] + " ");
		System.out.println();
	}

	private static void sortNumbers(int[] numbers) {
		boolean stillGoing;
		while(stillGoing) {
			for(int i = 0; i<numbers.length; i++) {
				if(numbers[i]>numbers[i+1]) {
					
//					int numExtra;
//					numExtra = numbers[i];
//					numbers[i] = numbers[i+1];
//					numbers[i+1] = numExtra;
					
					numbers = swap(numbers, i);
				}
			}
		}
		
	}
	private static int[] swap(int[] array, int primaryIndex) {
//		int numExtra;
//		numExtra = num1;
//		num1 = num2;
//		num2 = numExtra;
//		int [] nums = new int[]{num1, num2};
//		return nums;
		int tempValue = array[primaryIndex];
		array[primaryIndex + 1] = array[primaryIndex];
		array[primaryIndex] = tempValue;
		return array;
		
		
		
		
	}
}
