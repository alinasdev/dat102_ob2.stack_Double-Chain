package temp;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.println(sumAvN(5));
	}

	public static int sumAvN(int n) {
		
		if (n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		while(n >= 1) {
			return sumAvN(n-1) + (sumAvN(n - 2));
		}
		return 0;

	}
}
