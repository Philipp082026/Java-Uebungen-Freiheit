package aufgaben.aufgabe2;

public class Aufgabe2 {
// Bei der Lösung der Aufgabe soll nicht der Datentyp String verwendet werden!
	
	// Ausgabe der Anzahl der Ziffern einer Zahl 
	public static int lengthOfNumber(int number) {
		int help = number;
		int count = 0;
		while (help != 0) {
			help = help / 10; 	
			count++;
		}
		return count;	
	}
	// Ausgabe der ersten Ziffer von einer Zahl
	public static int firstDigit(int number) {
		int help = number;
		if (help < 0)
			help = help * (-1);
		if (help < 10)
			return help;
		while (help > 9) {
			help = help / 10;
		}
		return help;
	}
	// Methode gibt den Wert 10^n zurück.
	public static int powerOf10ToN(int n) {
		int potenz = n;
		int result = 1;
		while (potenz > 0) {
			result = result * 10;
			potenz--;
		}
		return result;
	}
	// Methode entfernt die erste Ziffer von number.
	public static int cutFirstDigit(int number) {
		int help = number;
		if (help < 0)
			help = help * (-1);
		int result = help % (powerOf10ToN((lengthOfNumber(help)-1)));
		if (number < 0)		// Damit das Minus wieder dran kommt.
			result = result * (-1); 
		return result;
	}
	// Methode gibt true zurück, wenn die 2. Ziffer von number eine 0 ist.
	public static boolean secondDigitIsZero(int number) {
		if (number > -10 && number < 10)
			return false;
		int help = number;
		if(help < 0)
			help = help * (-1);
		// return (firstDigit(help) != firstDigit(help-(powerOf10ToN((lengthOfNumber(help)-2)))));  --> geht auch
		return (lengthOfNumber(number) - 1 != lengthOfNumber(cutFirstDigit(number)));
	}
	
	public static void main(String[] args) {
		
		int number = 1011;
		int n = 7;
		System.out.println("Anzahl der Ziffern von:");
		System.out.println(number + "    --> " + lengthOfNumber(number));
		System.out.println("Die erste Ziffer von:");
		System.out.println(number + "    --> " + firstDigit(number));
		System.out.println("10 potenzieren:");
		System.out.println(n + "    --> " + powerOf10ToN(n));
		System.out.println("Ausgabe ohne die erste Ziffer:");
		System.out.println(number + "    --> " + cutFirstDigit(number));
		System.out.println("Die 2. Ziffer von number ist eine Null:");
		System.out.println(number + "    --> " + secondDigitIsZero(number));
	}
}
