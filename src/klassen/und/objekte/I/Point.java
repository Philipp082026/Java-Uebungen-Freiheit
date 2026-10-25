package klassen.und.objekte.I;

public class Point {
	
	// --- Objektvariablen ---------
	private int x;
	private int y;
	
	// --- Konstruktoren -----------
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public Point(int value) {
		this.x = value;
		this.y = value;
	}
	public Point() {
		this.x = 0;
		this.y = 0;
	}
	
	// --- Getter ------------------
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	
	// --- weitere Objektmethoden ----
	public void print() {
		System.out.println("[ x=" + this.x + ", y=" + this.y+ " ]");
	}
	
	public void translate(int deltaX, int deltaY) { // Da hier in der Methode nur eine Berechnung erfolgt, lautet der Rückgabetyp void.
		this.x = this.x + deltaX;
		this.y = this.y + deltaY;
	}
	
	// Methoden vergleichen jeweils zwei Koordinatenwerte
	public boolean isLeft(Point otherPoint) {
		return (this.x < otherPoint.x);					// Zugriff auf die X-Koordinate des anderen Punktes, der zum Vergleich herangezogen wird.
	}
	public boolean isRight(Point otherPoint) {
		return (this.x > otherPoint.x);
	}
	public boolean isAbove(Point otherPoint) {
		return (this.y > otherPoint.y);
	}
	public boolean isBelow(Point otherPoint) {
		return (this.y < otherPoint.y);
	}
	public Point add(Point p) { // Point-objekterzeugende Methode
		int newX = this.x + p.x;
		int newY = this.y + p.y;
		return new Point(newX, newY); // bestehende Punkte sollten unverändert bleiben, stattdessen lieber ein neues Point-Objekt erstellen und ausgeben
	}
}
