package aufgaben.aufgabe4;

public class Bruch {
	
	private int zaehler;
	private int nenner;
	
	public Bruch() {
		this(1,1);
	}
	public Bruch(int zaehler, int nenner) {
		if (nenner < 0) { 	// Verschiebung des Minuszeichens in den Zaehler
			zaehler = -zaehler;
			nenner = -nenner;
		}
		this.zaehler = zaehler;
		this.nenner = nenner;
	}
	// Ausgabe jeweils der gekürzten Brüche
	public Bruch plus(Bruch b) {
		int zaehler = this.zaehler * b.nenner + b.zaehler * this.nenner;
		int nenner =  b.nenner * this.nenner;
		Bruch neuerBruch = new Bruch(zaehler, nenner);
		return neuerBruch.kuerzen(); // Aufruf der Methode kuerzen() von dem Objekt neuerBruch, die Parameterwerte von neuerBruch werden in der Methode kuerzen für this.zaehler und this.nenner verwendet
	}
	public Bruch minus(Bruch b) {
		int zaehler = this.zaehler * b.nenner - b.zaehler * this.nenner;
		int nenner =  b.nenner * this.nenner;
		Bruch neuerBruch = new Bruch(zaehler, nenner);
		return neuerBruch.kuerzen();
	}
	public Bruch mal(Bruch b) {
		Bruch neuerBruch = new Bruch(this.zaehler * b.zaehler, this.nenner * b.nenner);
		return neuerBruch.kuerzen();
	}
	public Bruch geteilt(Bruch b) {
		Bruch neuerBruch = new Bruch(this.zaehler * b.nenner, this.nenner * b.zaehler);
		return neuerBruch.kuerzen();
	}
	public Bruch kuerzen() { 	// Die Variablen this.zaehler und this.nenner greifen in diesem Moment automatisch auf die Werte des frisch berechneten neuerBruch aus plus, minus, mal oder geteilt zu.
		if (this.zaehler == 0) 
			return new Bruch(0, 1);
		int ggT = ggT(this.zaehler, this.nenner);
		if(ggT != 1) 
			return new Bruch(this.zaehler / ggT, this.nenner / ggT);
		return new Bruch(this.zaehler, this.nenner);
	}
	public String toString() {
		return (this.zaehler + "/" + this.nenner);
	}
	// gibt den größten gemeinsamen Teiler zweier Zahlen (Euklidischer Algorithmus) zurück
	public int ggT(int zahl1, int zahl2) {
		int a = zahl1;
		int b = zahl2;
		if (zahl1 < 0) 			// bei der Ermittlung des ggT wird nur mit porsitven Zahlen gerechnet
			a = a * (-1);
		if (zahl2 < 0)
			b = b * (-1);
		
		while (a != b) {
			if (a > b)
				a = a - b;
			else 
				b = b - a;
		}
		return a;
	}
	// einige Vergleichsmethoden
	public boolean istGroesser(Bruch b) {
		return (this.zaehler*b.nenner > b.zaehler*this.nenner);  // anstatt das Ergebnis durch Division der Brüche zu ermitteln (fehleranfälliger), lieber die Zähler mit den Nennern des jeweiligen anderen Bruchs addieren
	}
	public boolean istKleiner(Bruch b) {
		return (this.zaehler*b.nenner < b.zaehler*this.nenner);
	}
	public boolean istGleich(Bruch b) {
		return (this.zaehler*b.nenner == b.zaehler*this.nenner);
	}
}
