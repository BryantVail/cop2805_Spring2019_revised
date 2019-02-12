package week05Assignment;

/**
 * 
 * @author Bryant V
 *
 */
public class EuclidGcd {
	
	/**
	 * constructor
	 */
	public EuclidGcd() {
		
	}
	
	private long getEuclidGcdBreak(long n1, long n2){
		if(n1 % n2 == 0) {
			return n2;
		}
		else {
			
			return getEuclidGcdBreak(n2, n1 % n2);
				
		}
	}
	
	public long start(long n1, long n2) {
		return getEuclidGcdBreak(n1, n2);
	}

}
