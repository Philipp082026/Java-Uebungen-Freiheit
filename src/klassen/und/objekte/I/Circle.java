package klassen.und.objekte.I;

public class Circle {

	// ------- Objektvariable ---------------
	private double radius;
	
	// ------- Konstruktoren ----------------
	public Circle(double radius) { // Stichwort: Überladen von Konstruktoren
		this.radius = radius;
	}
	public Circle() {		// parameterlos
		this.radius = 1.0;	// Standardwert - Einheitskreis
	}
	
	// ------- Getter der Objektvariablen ---
	public double getRadius() {
		return this.radius;
	}
	
	// ----- weitere Objektmethoden ---------
	public double getDiameter() {
		return 2.0 * this.radius;
	}
	
	public double circumference() {
		return Math.PI * this.getDiameter();
	}
	
	public double area() {
		return Math.PI * this.radius * this.radius;
	}
	
	public void print() {
		System.out.println("Radius         : " + this.radius);
		System.out.println("Durchmesser    : " + this.getDiameter());
		System.out.println("Umfang         : " + this.circumference());
		System.out.println("Flaecheninhalt : " + this.area());
	}
	 // Vergleichmethoden
	public boolean isSmaller(Circle c) {
		return (this.radius < c.radius);
	}
	public boolean isBigger(Circle c) {
		return (this.radius > c.radius);
	}
	public boolean isEqual(Circle c) {
		return !this.isSmaller(c) && !this.isBigger(c);
	}
}
