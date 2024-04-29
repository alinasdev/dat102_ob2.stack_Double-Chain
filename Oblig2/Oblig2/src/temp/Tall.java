package temp;

public class Tall {
	
	public static void main(String Args[]) {
		System.out.println(sumAvN(0));
	}
	
	
	public static int sumAvN(int n) {
		
		while (n>=0) {
			return n+(sumAvN(n-1)); 
		}
		return 0;
		
	}
}
