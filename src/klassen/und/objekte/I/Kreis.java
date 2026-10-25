package klassen.und.objekte.I;

public class Kreis {
	
	private double radius;
	
	public Kreis(double radius) {
		this.radius = radius;
	}
	public Kreis() {
		this(1.0);    // this(), um dem vorhandene Konstruktor aufzurufen.
	}
	public double flaeche() {
		return Math.PI * this.radius * this.radius;
	}
	public double umfang() {
		return 2* Math.PI * this.radius;
	}
	public boolean istGroesserAls(Kreis anderer) {
		return (this.radius > anderer.radius);
	}
	public void print() {
		System.out.println("Kreis: r = " + this.radius + ", u = " + umfang() + ", A = " + flaeche());
	}
}
