package week04_Sets_and_Maps;

import java.util.*;

public class SetListPerformanceTest{
	
	static final int N = 50000;
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i< N; i++) {
			list.add(i);
			
		}
		
		//shuffle array list
		Collections.shuffle(list);
		
		//create a hashSET and test performance
		Collection<Integer> hashSet = new HashSet<>(list);
		System.out.println("Member test time for HashSet is\t\t\t" + getTestTime(hashSet) + " milliseconds");
		System.out.println("Remove element time for HashSet is\t\t"+ getRemoveTime(hashSet)+" milliseconds");
		
		//create a linkedHashSet, test its performance
		Collection<Integer> linkedHashSet = new LinkedHashSet<>(list);
		System.out.println("Member test time for LinkedHashSet is\t"+ getTestTime(linkedHashSet) + " milliseconds");
		System.out.println("Remove element time for LinkedHashSet is"+ getRemoveTime(linkedHashSet) + " milliseconds");
		
		//create a treeSet and test its performance
		Collection<Integer> treeSet = new TreeSet<>(list);
		System.out.println("Member test time for TreeSet is\t\t\t" + getTestTime(treeSet) + " milliseconds");
		System.out.println("Remove element time for TreeSet is\t\t" + getRemoveTime(treeSet) + " milliseconds");
		
		//create an array list and test the performance
		Collection<Integer> arrayList = new ArrayList<>(list);
		System.out.println("Member test time for ArrayList is\t\t" + getTestTime(arrayList) + " milliseconds");
		System.out.println("Remove element time for ArrayList is\t"+ getRemoveTime(arrayList)+ " milliseconds");
		
		//create a linkedList and test the performance
		Collection<Integer> linkedList = new LinkedList<>(list);
		System.out.println("Member test time for LinkedList is\t\t" + getTestTime(linkedList)  + " milliseconds");
		System.out.println("Remove element time for LinkedList is\t" + getRemoveTime(linkedList)+ " milliseconds");
		
	}//end main
	
	public static long getTestTime(Collection<Integer> c) {
		long startTime = System.currentTimeMillis();
		
		//test if a number is in the collection
		for(int i =0; i<N; i++) {
			c.contains((int)(Math.random() * 2 *N));
			
		}
		return System.currentTimeMillis() - startTime;
		
	}//end getTestTime
	
	public static long getRemoveTime(Collection<Integer> c) {
		long startTime = System.currentTimeMillis();
		
		for(int i =0; i< N; i++) {
			c.remove(i);
			
		}
		return System.currentTimeMillis() - startTime;
	}
}









