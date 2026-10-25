package uebungen.uebung3;

public class Uebung3 {
	
	// Ausgabe des 1x1 bis zu den 2 eingegebenen Zahlen nr1 und nr2
	public static void printTimesTables(int nr1, int nr2) {
		
		int a = 1;
		int b = 1;
		
		for (int i = 0; i < nr1; i++) {
			b = 1;
			for (int j = 0; j < nr2; j++) {
				System.out.println(a + " * " + b +" = " + (a*b));
				b++;
			}
			System.out.println();
			a++;
		}
		
	}
	
	public static void printTimesMatrix(int nr1, int nr2) {
		
		
		for (int a = 1; a <= nr1; a++) {
			for (int b = 1; b <= nr2; b++) {
				System.out.print((a*b) + " ");
			}
			System.out.println();
		}
	}
	
	public static void printTriangleUp(int height) {
		
		int i = 0;
		int j = 0;
		
		while (i<height) {
			j = 0 + i;
			while (j<height) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
	}
	
	public static void printAllPossibleCombinations(int number) {
		
		int limit = Math.abs(number);
		int x = -limit;
		
		while (x <= limit) {
			int y = x; 		// da Bedingung: x <= y
			while (y <= limit) {
				int z = y;  // da Bedingung: y <= z
				while (z <= limit) {
					if (x * y * z == number) { // da jeweils immer y=x und z=y gesetzt wird, ist die Bedingung x<=y<=z schon vorhanden
						System.out.println(x + " * " + y + " * " + z + " = " + number);
					}
					z++;
				}
				y++;
			}
			x++;
		}
	}
	
	public static void printSeconds(int seconds) {
		
		int tage = seconds/86400;
		int stunden = (seconds%86400)/3600;
		int minuten = (seconds%3600)/60;
		int sekunden = seconds%60;
		boolean davorStehtSchonEtwas = false;
		
		System.out.print(seconds + " Sekunden sind ");
		if (tage > 0) {
			if (tage > 1)
				System.out.print(tage + " Tage");
			else 
				System.out.print(tage + " Tag");
			davorStehtSchonEtwas = true;
		}	
		if (stunden > 0) {
			if (davorStehtSchonEtwas)
				System.out.print(", ");
			if (stunden > 1)
				System.out.print(stunden + " Stunden");
			else	
				System.out.print(stunden + " Stunde");
			davorStehtSchonEtwas = true;
		}
		if (minuten > 0) {
			if (davorStehtSchonEtwas)
				System.out.print(", ");
			if (minuten > 1 )
				System.out.print(minuten + " Minuten");
			else
				System.out.print(minuten + " Minute");
			davorStehtSchonEtwas = true;
		}
		if (sekunden > 0) {
			if (davorStehtSchonEtwas)
				System.out.print(", ");
			if (sekunden > 1)
				System.out.print(sekunden + " Sekunden");
			else 
				System.out.print(sekunden + " Sekunde");
			davorStehtSchonEtwas = true;
		}	
		if (seconds == 0)
			System.out.print(seconds + " Sekunden");
		System.out.println(".");
	}

	public static void main(String[] args) {
		
		System.out.println("----------------- Aufgabe 3 ----------------" + "\n");
		printTimesTables(3,7);
		System.out.println("----------------- Aufgabe 4 ----------------" + "\n");
		printTimesMatrix(3,7);
		System.out.println("\n" + "----------------- Aufgabe 5 ----------------" + "\n");
		printTriangleUp(7);
		System.out.println("\n" + "----------------- Aufgabe 6 ----------------" + "\n");
		printAllPossibleCombinations(36);
		System.out.println("\n" + "----------------- Aufgabe 7 (Zusatz) ----------------" + "\n");
		printSeconds(90000);
		
	}

}
