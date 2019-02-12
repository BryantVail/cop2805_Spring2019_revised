package week05Assignment;

/**
 * 
 * @author Bryant V
 *
 */
public class Fibonacci {
	
	/**
	 * fibonacci
	 * @return long, fibonacci number
	 */
	public long fib(long index) {
		if(index == 0) {
			return 0;
		}else if(index ==1) {
			return 1;
		}else {
			return fib(index -1)+ fib(index -2);
		}
	}
}
