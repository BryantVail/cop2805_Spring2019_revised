package week09;

import java.util.HashMap;

//create own class, override 'equals' & 'hashCode' methods
//test this by inserting 3 instances into a HashMap



public class Practice {

	public static void main(String[] args) {
		// 
		
//		String name1 = "Elizabeth";
//		String name2 = "Henry";
//		String name3 = "Henry";
//		
//		System.out.println(name1 + " hash is \t" + name1.hashCode());
//		System.out.println(name2 + " hash is \t\t" + name2.hashCode());
//		System.out.println(name3 + "hash is \t\t"+ name3.hashCode());
		
		House home1 = new House("181 9th st", "Bill Gates");
		House home2 = new House("201 10th st", "Roger Moore");
		House home3 = new House("11 9th st", "Angel Gonzalez");
		House home4 = new House("10 21st st", "Shirley Brinson");
		House home5 = new House("8212 Troxler dr", "John Vail");
		
//		System.out.println("house1 = " + home1);
//		System.out.println("house2 = " + home2);
//		System.out.println("house3 = " + home3);
//		System.out.println("house4 = " + home4);
//		System.out.println("house5 = " + home5);
		
		System.out.println("house1.equals(house2) = " + home1.equals(home2));
		
		HashMap<Integer, House> houseHashMap = new HashMap<Integer, House>();
		
		houseHashMap.put(home1.hashCode(), home1);
		houseHashMap.put(home2.hashCode(), home2);
		houseHashMap.put(home3.hashCode(), home3);
		houseHashMap.put(home4.hashCode(), home4);
		houseHashMap.put(home5.hashCode(), home5);
		
		
		System.out.println(houseHashMap);
		
		
		
	}

}

//create own class, 
//override 'equals' & 
//'hashCode' methods
//test this by inserting 3 instances into a HashMap

class House extends Object{
	public String address;
	public String owner;
	private House house;
	
	public House(String address, String owner) {
		this.address = address;
		this.owner = owner;
	}
	
	@Override
	public boolean equals(Object house) {
		House otherHouse = (House) house;
		if(otherHouse.address == this.address) {
			return true;
		}else {
			return false;
		}
	}//end
	
	
//	@Override
//	public int hashCode() {
//		
//		
//		
//	}
	
	@Override
	public String toString() {
		return ("Address: " + this.address +", Owner: "+ this.owner + "\n"); 
	}
}























