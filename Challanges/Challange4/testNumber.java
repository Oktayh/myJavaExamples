public class isAllPairsSum10 {
	
	public static void main(String[] args) {

		System.out.println(isAllPairsSum10(1));			// true, because one digit
		
		System.out.println(isAllPairsSum10(614));		// true, because 6+4=10 
		
		System.out.println(isAllPairsSum10(3557));		// true, because 3+7=10 and 5+5=10
		
		System.out.println(isAllPairsSum10(184629));	// true, because 1+9=10, 8+2=10, and 4+6=10
		
		System.out.println(isAllPairsSum10(247398));	// false, because 4+9 is not equal to 10, even though 2+8=10 and 7+3=10
		
	}

	/**
	 * This method is used to test whether an integer number 
	 * consists of digit pairs whose sum is 10. 
	 * 
	 * A pair of digits is defined as the two digits 
	 * whose positions are same from left and right of a number. 
	 * For example, given n=21798, 2 and 8 are paired with each other:
	 * 2 and 8 are the first digit from left and right-hand side, respectively.
	 * Similarly, 1 and 9 are a pair of digits as well.
	 * 
	 * @param n integer number that may have any number of digits [1-10] 
	 * 			(assume that n is positive)
	 * @return true if the sum of each digit pair is 10 
	 * 		   false otherwise
	 * */
	public static boolean isAllPairsSum10(int n) {		
		int l,r;
		
		if ( n <= 10 )
			return true;

		r = n % 10;
		l = (int) Math.floor(n / Math.pow(10, Math.floor(Math.log10(n))));

		n = n / 10;
		n %= (int) Math.pow(10, (int) Math.log10(n));
		
		if(r+l == 10) {
			return isAllPairsSum10(n);
		}else
			return false;
	
	}
	
}
