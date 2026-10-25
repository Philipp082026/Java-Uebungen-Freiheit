package klassen.und.objekte.I;

public class Nachricht {
	
	String text;
	
	public Nachricht(String text) {
		this.text = text;
	}
	
	public void print() {
		System.out.println(this.text);
	}
	public void print(String prefix) {
		System.out.println(prefix + ": " + this.text);
	}
	public void print(int anzahl) {
		for (int i = 0; i < anzahl; i++)
			System.out.print(this.text);
		System.out.println();
	}
}
