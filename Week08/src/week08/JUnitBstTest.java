package week08;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;


/**
 * Tests the BST implementation
 * @author Scott LaChance
 *
 */
public class JUnitBstTest
{

	@Test
	public void test()
	{
		BST<String> tree = new BST<String>();
		
		tree.insert("George");
		tree.insert("Ringo");
		tree.insert("Paul");
		tree.insert("John");
		tree.insert("Peter");
		tree.insert("Mary");
		tree.insert("Stevie");
		tree.insert("Daniel");
		tree.insert("Zach");
		tree.insert("Horatio");
		tree.insert("James");
		tree.insert("David");
		tree.insert("June");
		tree.insert("Alice");
		tree.insert("Bruce");
		tree.insert("Nick");
		tree.insert("Vanessa");
		
		List<String> leaves = tree.getLeafData();
		validateList(leaves);
//		trace("Leaves");
//		for(String item : leaves)
//		{
//			trace(item);
//		}
	}
	
	private void validateList(List<String> leaves)
	{
		assertEquals("Size mismatch in leaves: expected " + expectedLeaves.length + " actual: " + leaves.size(), expectedLeaves.length, leaves.size());
		for(String name : expectedLeaves)
		{
			if(!leaves.contains(name))
			{
				trace(name + " not found in leaves list");
				fail(name + " not found in leaves list");
			}
		}
	}

	private void trace(String msg)
	{
		System.out.println(msg);
	}
	
	private static String[] expectedLeaves = 
		{"Bruce","David","James","June","Nick","Peter","Vanessa"};
}

