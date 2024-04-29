package temp;

public class Tester implements Parentessjekker {

	public static void main(String[] args) {
		char a = '(';
		Tester t = new Tester();
		System.out.println("Tester første parantes: " + a);
		System.out.println("Er venstre? " + t.erVenstreparentes(a));
		System.out.println("Er høgre? " + t.erHogreparentes(a));

		char b = ')';
		System.out.println();
		System.out.println("Er: " + a + "+ " + b + " et par? " + t.erPar(a, b));
		System.out.println("Er: " + a + "+ " + a + " et par? " + t.erPar(a, a));
	}

	@Override
	public boolean erVenstreparentes(char p) {

		return p == '(' || p == '[' || p == '{';
	}

	@Override
	public boolean erHogreparentes(char p) {
		return p == ')' || p == ']' || p == '}';
	}

	@Override
	public boolean erPar(char venstre, char hogre) {
		return (venstre == '(' && hogre == ')') || (venstre == '[' && hogre == ']') || (venstre == '{' && hogre == '}');
	}

	@Override
	public boolean erBalansert(String s) {
		Tester a = new Tester();
		for (int i = 0; i<s.length(); i++) {
			char p = s.charAt(i);
			if(p == '(' || p == '[' || p == '{') {
				a=p;
			}
		}
		return false;
	}

}
