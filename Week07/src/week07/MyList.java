package week07;

import java.util.Collection;

public interface MyList<T> extends Collection<T> {
	
	Object[] list = new Object[100];
	double threshold = .75;
	

	/*
	 * Common Operations for Lists
	 * 	retrieve
	 * 	insert
	 * 	delete
	 * 	how many
	 * 	whether (the element is in the list)
	 * 	check if the list is empty
	 */
	
	
	//+ add(int index, T t): 		void
	public void add(int index, T t);
	
	//+get(int index): T
	public T get(int index);
	
	//+ indexOf(Object e)
	public int indexOf(Object e);
	
	//+ lastIndexOf(T t): int
	public int lastIndexOf(T t);
	
	//+remove(int index):T
	public T remove(int index);
	
	//+set(int index, T t): T
	public T set(int index);
	
	//add(T t): boolean
	@Override
	public default boolean add(T t) {
		add(size(), t);
		return true;
	}
	
	//isEmpty, @Override
	@Override
	public default boolean isEmpty() {
		return size() ==0;
	}
	
	//remove
	@Override
	public default boolean remove(Object t) {
		if(indexOf(t) >= 0) {
			remove(indexOf(t));
			return true;
		}else {
			return false;
		}
	}//end remove(Object t)
	
	//+set(int index, T t): T
	public T set(int index, T t);
	
	//@Override containsAll(Collection<?> c)
	@Override
	public default boolean containsAll(Collection<?> c) {
		//left as an exercise apparently
		return true;
	}
	
	@Override
	public default boolean addAll(Collection<? extends T> c) {
		//left as an exercise too
		return true;
	}
	
	@Override
	public default boolean removeAll(Collection<?> c) {
		//left also as a good exercise
		return true;
	}
	
	@Override
	public default boolean retainAll(Collection<?> c) {
		//these exercises
		return true;
	}
	
	@Override
	public default Object[] toArray() {
		//going to be an exercise too
		return null;
	}
	
	@Override
	public default <T> T[] toArray(T[] array) {
		//to do
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * 
	 * before is below
	 */
	
	public static void doubleArrayCapacity(Object[] list2) {
		// TODO Auto-generated method stub
		int newLength = list2.length *2;
		Object[] 
	}

	public static void MyList.doubleArrayCapacity(Object[] list2);

	private T[] grow(T[] array) {
		
	}
	
	//+clear(): 		void
	public default void clear() {
		
		for(int i = 0; i<this.list.length; i++) {
			remove(i);
		}
	}

	
	
	//+contains(E):		boolean
	//+get(int):		E
	//+indexOf(E):		int
	//+isEmpty(): 		boolean
	//+lastIndexOf(E):	int
	//+remove(int): 	E
	//+set(int, E):		E
	//+size():			int

}
