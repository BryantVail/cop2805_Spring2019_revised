




public class MyArrayList<T> {
	private T[] array;
	private int size;
	private int capacity;
	
	public MyArrayList() {
		this.capacity = 4;
		this.array = (T[]) new Object[this.capacity];
	}
	public MyArrayList(T[] array) {
		this.array  =  array;
		this.size 	= array.length;
	}
	
	public boolean setCapacity(int proposedCapacity) {
		if(this.array.length < size) {
			return false;
		}else {
			T[] newArray = (T[]) new Object[proposedCapacity];
			this.array = newArray;
			return true;
		}
	}
	
	public int size() {
		return size;
	}
	
	public T get(int index){
		//try
		try {
				return this.array[index];
		}catch(IndexOutOfBoundsException e) {
				System.out.println("Please select an index within range");
				return null;
		}
	}//end get
	
	public boolean add(T element) {
		if((boolean)array[size()]) {
			array[size()+1] = element;
			size++;
			return true;
		}else{
			T[] newArray = grow(this.array);
			add(element);
		}
		return false;
	}//end add(T element)
	
	
	private T[] grow(T[] array) {
		int newCapacity  = array.length *2;
		T[] newArray = (T[]) new Object[newCapacity];
		for(int i = 0; i< array.length; i++) {
			newArray[i] = array[i];
		}
		return newArray;
	}
	
	public T remove(int index) {
		try {
				T removedValue = this.array[index];
				this.size--;//4, now 3, 
				for(int i = index; i<=size(); i++) {
//					T tempValue = this.array[i];
					this.array[i] = this.array[i+1];
				}
				return removedValue;
		}//end try
		//catch
		catch(IndexOutOfBoundsException e) {
			System.out.println("Please select a valid index to remove()");
//			throw new IndexOutOfBoundsException("Please select a valid index to remove()");
			return null;
			
		}
	}//end remove
	
	

}//end class
