package temp;

public interface Parentessjekker {
	
	
	
	boolean erVenstreparentes(char p);
	/**
	 * Metoden sjekker om et tegn er '(', '[' eller '{'.
	 * 
	 * @param p tegn som skal sjekkes
	 * @return true dersom tegnet er en venstreparentes, false ellers
	 */
	
	boolean erHogreparentes (char p);
	/**
	 * Metoden sjekker om et tegn er ')', ']' eller '}'.
	 * 
	 * @param p tegn som skal sjekkes
	 * @return true derstom tegnet er en h�greparentes, false ellers
	 */
	
	boolean erPar(char venstre, char hogre);
	/**
	 * Metoden sjekker om to tegn er et parentespar.
	 * 
	 * @param venstre er f�rste tegn i et potensielt par
	 * @param hogre er andre tegn i et potensielt par
	 * 
	 * @return true dersom de matcher, dvs venstre er en venstreparantes og h�gre er tilh�rende h�greparantes
	 */
	boolean erBalansert(String s);
	/**
	 * Metoden sjekker om en streng som inneholder paranteser er balansert.
	 * Den ser bort fra tegn som ikke er paranteser
	 * 
	 * @param s streng som skal sjekkes
	 * @return true dersom parentesene i strenger er balansert, false ellers.
	 */
}
