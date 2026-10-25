package klassen.und.objekte.II;

public class Zähler {
	
	private int wert;
	
	public Zähler(int wert) {
		this.wert = wert;
	}
	
	public Zähler erhöhen() {
		this.wert++;
		return this;		// Jeder Aufruf von erhöhen() gibt this zurück, sodass Aufrufe verkettet werden können (method chaining).
	}
	public void print() {
		System.out.println(wert);
	}
}
