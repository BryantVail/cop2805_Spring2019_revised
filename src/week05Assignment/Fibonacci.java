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
	
	public long fibEfficient(long n) {
		
		long f0 =0;
		long f1 =1;
		long f2 =1;
		
		if(n == 0) {
			return f0;
		}else if(n ==1) {
			return f1;
		}else if(n ==2) {
			return f2;
		}
		
		for(int i=3; i<=n; i++) {
			f0 = f1;
			f1 = f2;
			f2 = f0 + f1;
		}
		
		return f2;
	}
}





