package week09;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class MyHashMapLinear<K, V> implements MyMap<K, V> {
	
	private int capacity;
	private float loadFactor;
	private static int DEFAULT_CAPACITY  = 4;
	private static float DEFAULT_LOAD_FACTOR = .5f;
	
	LinkedList<MyMap.Entry<K,V>>[] table;
	private int size;
	
	public MyHashMapLinear() {
		this.capacity = DEFAULT_CAPACITY;
		this.loadFactor = DEFAULT_LOAD_FACTOR;
	}
	
	public MyHashMapLinear(int initialCapacity) {
		
		//RETURNS -1 if its less that the current size
		int setCapacityValue = setCapacity( initialCapacity);
		if(setCapacityValue == -1) {
			this.capacity = DEFAULT_CAPACITY;
		}
		this.loadFactor = DEFAULT_LOAD_FACTOR;
		
	}
	
	public MyHashMapLinear(int initialCapacity, float loadFactor) {
		this.capacity = initialCapacity; 
		this.loadFactor = loadFactor; 
		
	}
	
	@Override
	public int hashCode(K key) {
		return key % this.size;
	}
	

	//set newCapacity or return -1
	private int setCapacity(int newCapacity) {
		// 
		if(newCapacity> this.capacity) {
			this.capacity = newCapacity;
			return this.capacity; 
		}else {
			return -1;
		}
		
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean containsKey(Object key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsValue(Object value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Set entrySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public V get(K key) {
		// linear probing
		int bucketIndex = hash(key.hashCode());
		
		if(this.table[bucketIndex] != null) {
			LinkedList<Entry<K, V>> bucket = this.table[bucketIndex];
			for(Entry<K, V> entry : bucket) {
				if(entry.getKey().equals(key)) {
					return entry.getValue();                
				}
			}
		}
		
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size ==0;
	}

	@Override
	public Set keySet() {
		//
		Set<K> set = new HashSet<K>();
		
		for(int i = 0; i< capacity; i++) {
			LinkedList<Entry<K, V>> bucket = this.table[i];//table is a class level variable
			for(Entry<K, V> entry: bucket) {
				set.add(entry.getKey());
			}
		}
		return set;
	}

	@Override
	public V put(K key, V value) {
		// 
		if(get(key) != null) {
			int bucketIndex = hash(key.hashCode());
			LinkedList<Entry<K, V>> bucket = table[bucketIndex];
			for(Entry<K, V> entry : bucket) {
				if(entry.getKey().equals(key)) {
					V oldValue  = entry.getValue();
					entry.value = value;
					return oldValue;
				}
			}
		}//
		
		if(this.size >= capacity * this.loadFactor) {
			if(capacity == MAXIMUM_CAPACITY) {
				throw new RuntimeException("Exceeding maximum capacity");
			}
		}
		
		int bucketIndex = hash(key.hashCode());
		
		if(table[bucketIndex]  == null) {
			table[bucketIndex] = new LinkedList<Entry<K, V>>();
		}
		
		table[bucketIndex].add(new MyMap.Entry<K, V>(key, value));
		size++;
		
		return value;
		
	}//end put(K key, V value)

	@Override
	public void remove(K key) {
		// 
		int bucketIndex = hash(key.hashCode());
		
		if(table[bucketIndex] != null) {
			LinkedList<Entry<K, V>> bucket = table[bucketIndex];
			for(Entry<K, V> entry: bucket) {
				if(entry.getKey().equals(key)) {
					bucket.remove(entry);
					size--;
					break;
				}
			}
		}
	}

	private int hash(int hashCode) {
		// 
		return supplementalhash(hashCode) & (this.capacity -1);
		
	}

	@Override
	public int size() {
		// incremented in methods that increase this.size
		return this.size;
	}

	@Override
	public Set values() {
		// 
		Set<V> set = new HashSet<V>();
		
		for(int i = 0; i< this.capacity; i++) {
			if(this.table[i] != null) {
				LinkedList<Entry<K, V>> bucket = this.table[i];
				for(Entry<K, V> entry: bucket) {
					set.add(entry.getValue());
				}
			}
		}
		return set;
	}
	
	//implement an alternate that doesn't replace the value when there is a collision
	//	find an alternate slot using linear probing
	
	

}
