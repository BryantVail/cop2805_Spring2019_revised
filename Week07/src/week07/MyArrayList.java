package week07;

public class MyArrayList<T> implements MyList {
	
	public static final int INITIAL_CAPACITY = 16;
	private T[] data  = (T[])new Object[INITIAL_CAPACITY]; 
	private int size = 0;//number of elements in this list
	
	/*
	 * create empty list
	 */
	public MyArrayList() {
		//done w/locals
	}
	
	public MyArrayList(T[] objects) {
		for(int i =0; i<objects.length; i++) {
			add(objects[i]);//don't use super(objects)
		}
	}//end
	
	@Override
	public void add(int index, T t) {
		//ensure index is in the right range
		if(index< 0 || index >size) {
			throw new IndexOutOfBoundsException("Index: "+index + ", Size: " + size);
		}
		ensureCapacity();
		
		//move elements to the right after the specified index
		for(int i = size -1; i>= index; i--) {
			data[i+1] = data[i];
		}
		
		//insert new element to data[index]
		data[index] = t;
		
		//increase size by 1
		this.size++;
	}

	private void ensureCapacity() {
		// 
		if(size >= data.length) {
			T[] newData = (T[])(new Object[size*2+1]);
			System.arraycopy(data,  0,  newData,  0,  size);
			data = newData;
		}
	}

}
