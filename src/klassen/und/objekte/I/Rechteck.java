package klassen.und.objekte.I;

public class Rechteck {
	
	private int breite;
	private int hoehe;
	
	public Rechteck(int breite, int hoehe) {
		this.breite = breite;
		this.hoehe = hoehe;
	}
	
	public int flaecheninhalt() {
		return this.breite * this.hoehe;
	}
	public int umfang() {
		return 2 * this.breite + 2 * this.hoehe;
	}
	public void print() {
		System.out.println("[ breite=" + this.breite + ", hoehe=" + this.hoehe + " ]");
	}
}
