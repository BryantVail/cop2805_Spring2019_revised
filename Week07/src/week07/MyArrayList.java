package week07;

import java.util.Iterator;

public class MyArrayList<T> implements MyList<T> {
	
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
	public void add(int index, Object t) {
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
		data[index] = (T)t;
		
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
	}//end
	
	@Override
	public void clear() {
		data = (T[]) new Object[INITIAL_CAPACITY];
		size= 0;
	}
	
	@Override
	public boolean contains(Object t) {
		for(int i = 0;i<size; i++) {
			if(t.equals(data[i])) return true;
		}
		return false;
	}
	
	@Override
	public T get(int index) {
		checkIndex(index);
		return data[index];
	}
	
	private void checkIndex(int index) {
		if(index< 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index: " + index+ ", Size: " + size);
		}
	}//end
	
	@Override
	public int indexOf(Object t) {
		for(int i = 0; i<size; i++) {
			if(t.equals(data[i])) return i;
		}
		return -1;
	}
	
	
	@Override
	public int lastIndexOf(T t) {
		for(int i = size -1; i>= 0; i--) {
			if(t.equals(this.data[i])) return i;
		}
		return -1;
	}
	
	@Override
	public T remove(int index) {
		checkIndex(index);
		
		T t = this.data[index];
		
		//shift data to the left
		for(int j = index; j< size -1; j++) {
			this.data[j] = this.data[j+1];
		}
		
		this.data[size -1]= null;//last element is now null
		//decrement local size variable
		this.size--;
		
		return t;
	}//end
	
	@Override
	public T set(int index, T t) {
		checkIndex(index);
		T old = this.data[index];
		this.data[index] = t;
		return old;
	}
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder("[");
		
		for(int i = 0; i< size; i++) {
			result.append(this.data[i]);
			if(i< size -1) result.append(", ");
		}
		return result.toString()+ "]";
	}//end
	
	public void trimToSize() {
		if(size != data.length) {
			T[] newData = (T[]) (new Object[size]);
			System.arraycopy(data,  0,  newData,  0,  size);
			data = newData;
		}//if size == capacity, no need to trim ;)
	}//end trimToSize()
	
	@Override
	public Iterator<T> iterator(){
		return new ArrayListIterator();
	}
	
	private class ArrayListIterator implements Iterator<T>{
		
		private int current = 0;//current index
		
		@Override
		public boolean hasNext() {
			return current < size;
		}
		
		@Override
		public T next() {
			return data[current++];
		}
		
		@Override//remove the element returned by the last next()
		public void remove() {
			if(current ==0) {
				throw new IllegalStateException();
			}
			MyArrayList.this.remove(--current);
		}
	}//end private class ArrayListIterator
	
	@Override/**return the number of elements in this list */
	public int size() {
		return this.size;
	}
	
}
