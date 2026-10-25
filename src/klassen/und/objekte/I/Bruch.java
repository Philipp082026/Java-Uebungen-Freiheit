package klassen.und.objekte.I;

public class Bruch {
	
	private int zaehler;
	private int nenner;
	
	public Bruch(int zaehler, int nenner) {
		if (zaehler > 0 && nenner < 0) {
			zaehler = -zaehler;
			nenner = -nenner;
		}
		if (zaehler < 0 && nenner < 0) {
			zaehler = -zaehler;
			nenner = -nenner;
		}
		this.zaehler = zaehler;
		this.nenner = nenner;
	}
	
	public double wert() {
		return (double) this.zaehler/this.nenner;
	}
	public void print() {
		System.out.println(this.zaehler + "/" + this.nenner);
	}
	public Bruch multiplizieren(Bruch anderer) {
		return new Bruch(this.zaehler * anderer.zaehler, this.nenner * anderer.nenner);
	}
	public Bruch addieren(Bruch anderer) {
		Bruch erweiternBruchThis = new Bruch(this.zaehler * anderer.nenner, this.nenner * anderer.nenner); 		// Erweiterung des Bruches von this um gleichen Nenner zu haben
		Bruch erweiternBruchAnderer = new Bruch(anderer.zaehler * this.nenner, anderer.nenner * this.nenner);	// Erweiterung des Bruches von anderer um gleichen Nenner zu haben
		return new Bruch(erweiternBruchThis.zaehler + erweiternBruchAnderer.zaehler, erweiternBruchAnderer.nenner);
	}
}
