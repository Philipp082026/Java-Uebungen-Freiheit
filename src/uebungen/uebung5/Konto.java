package uebungen.uebung5;

public class Konto {
	
	private double guthaben;
	private int pin;
	private double dispogrenze;
	
	public Konto(int pPin) {
		this.pin = pPin;
		this.guthaben = 0.0;
		this.dispogrenze = -1000.0;
	}
	public void einzahlen(double betrag) {
		if (betrag > 0) {
			this.guthaben = this.guthaben + betrag;
			System.out.print("Es wurden ");
			System.out.printf("%.2f", betrag);
			System.out.println(" Euro eingezahlt.");
		}
	}
	public void kontoauszug(int pPin) {
		if (this.pin == pPin) {
			System.out.print("Ihr aktuelles Guthaben betraegt ");
			System.out.printf("%.2f", this.guthaben);
			System.out.println(" Euro.");
		}
		else 
			System.out.println("Falsche PIN!");
	}
	public void auszahlen(int pPin, double betrag) {
		if (this.pin == pPin) {
			if (this.guthaben - this.dispogrenze >= betrag) {
				this.guthaben = this.guthaben - betrag;
				System.out.print("Es wurden ");
				System.out.printf("%.2f", betrag);
				System.out.println(" Euro ausgezahlt.");
			}
			else {
				System.out.print("Ihr Guthaben reicht nicht, um ");
				System.out.printf("%.2f", betrag);
				System.out.println(" auszuzahlen.");
			}
		}
		else 
			System.out.println("Falsche PIN!");
	}
	public void zinsenZahlen() {
		final double DISPOZINSEN = 12.0;
		final double GUTHABENZINSEN = 0.5;
		if (this.guthaben < 0) {
			System.out.print("Ihnen wurden ");
			System.out.printf("%.2f", -this.guthaben * DISPOZINSEN / 100);
			System.out.println(" Euro Zinsen abgebucht.");
			this.guthaben = this.guthaben + this.guthaben * DISPOZINSEN / 100;
		}
		else {
			System.out.print("Ihnen wurden ");
			System.out.printf("%.2f", this.guthaben * GUTHABENZINSEN / 100);
			System.out.println(" Euro Zinsen gutgeschrieben");
			this.guthaben = this.guthaben + this.guthaben * GUTHABENZINSEN / 100;
		}
	}
}
