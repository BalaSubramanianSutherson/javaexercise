import java.math.BigInteger;

public class Factorial {

	public static long findFactorial(int n) {
		if(n == 0) {
			return 1;
		}
		return n * findFactorial(n-1);
	}
	
	public static String findFactorial2(int n) {
		String s  = "";
		BigInteger bigInt = new BigInteger("1");
		for(int i = 1; i<=n; i++) {
			bigInt = bigInt.multiply(BigInteger.valueOf(i));
			s = bigInt+"";
		}
		return s;
	}

	public static void main(String[] args) {
		System.out.println(findFactorial2(25));
		
	}

}
