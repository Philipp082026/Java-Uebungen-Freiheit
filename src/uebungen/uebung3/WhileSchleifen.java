package uebungen.uebung3;

public class WhileSchleifen {
	
	public static void printRectangle(int width, int height) {
		
		int i = 0;
		
		while(i<height) {
			int j = 0;
			
			while(j<width) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
	}
	
	public static void printTriangle(int height) {
		
		int i = 0;
		while (i<height) {
			int j = 0;
			while(j<=i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}		
	}
	
	public static void printTriangleR(int height) {
		
		int i = 0;
		while (i<height) {
			int j = 0 + i;
			while(j<height-1) {
				System.out.print(" ");
				j++;
			}
			while(j<height+i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
	}
	
	public static void main(String [] args) {
		
		printRectangle(23,5);
		printTriangle(7);
		printTriangleR(7);
	}
}
