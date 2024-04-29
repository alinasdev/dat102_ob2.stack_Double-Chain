package temp;

public class Fibonacci2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibonacci(8));
	}

	public static int fibonacci(int n) {
		int a = 0;
		int b = 0;
		int c = 0;
		if (n > 1) {
			b = 1;
		}

		for (int i = 0; i < n; i++) {
			c =a+ b;
			a=b;
			b=c;
			
		}
		return c;

	}
}
