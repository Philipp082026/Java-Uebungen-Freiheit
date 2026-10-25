package aufgaben.aufgabe3;

public class Triangle {
	
	private int a;
	private int b;
	private int c;
	
	public Triangle(int pa, int pb, int pc) {
		a = pa;
		b = pb;
		c = pc;
	}
	
	public void print() {
		System.out.println("Seiten          : a=" + a + ", b=" + b + ", c=" + c);
		System.out.println("Umfang          : " + circumference());
		System.out.println("Flaecheninhalt  : " + area());
		
		if (equilateral()) 
			System.out.println("Das Dreieck ist gleichseitig.");
		if (isosceles() && !(equilateral()))
			System.out.println("Das Dreieck ist gleichschenklig.");
		if (!(equilateral()) && !(isosceles()))
			System.out.println("Das Dreieck ist unregelmaessig.");
		
		if (isRightAngled())
			System.out.println("Das Dreieck ist rechtwinklig.");
		else 
			System.out.println("Das Dreieck ist nicht rechtwinklig.");
		
		System.out.println();
	}
	public int circumference() {
		return a+b+c;
	}
	public double area() {
		double s = (a + b + c) / 2.0;
		double A = Math.sqrt(s * (s-a) * (s-b) * (s-c));
		return A;
	}
	
	// prüfen, ob gleichseitig
	public boolean equilateral() {
		return (a == b && b == c); 
	}
	// prüfen, ob gleichschenklig
	public boolean isosceles() {
		return (a == b || a == c || b == c);
	}
	
	// Vergleiche
	public boolean sameCircumference(Triangle t) {
		return (circumference() == t.circumference());
	}
	public boolean isSmaller(Triangle t) {
		return (area() < t.area());
	}
	public boolean isBigger(Triangle t) {
		return (area() > t.area());
	}
	
	// Vergleich, ob die Seiten zweier Dreiecke gleich lang sind, unabhängig von der Bezeichnung der Seite
	public boolean sidesAreEqual(Triangle t) {
		return ((t.a == a && t.b == b && t.c == c) || (t.a == a && t.b == c && t.c == b) || (t.a == b && t.b == a && t.c == c) || 
				(t.a == b && t.b == c && t.c == a) || (t.a == c && t.b == a && t.c == b) || (t.a == c && t.b == b && t.c == a));
	}		
	// Ausgabe, ob ein Dreieick rechtwinklig ist
	public boolean isRightAngled() {
		boolean a2 = (a*a == b*b + c*c);
		boolean b2 = (b*b == a*a + c*c);
		boolean c2 = (c*c == a*a + b*b);
		return (a2 || b2 || c2);	
	}
}
