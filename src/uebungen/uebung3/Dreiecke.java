package uebungen.uebung3;

public class Dreiecke {
	
	public static void printTriangle(int height)
	{
	    for(int row=0; row<height; row++)
	    {
	        for(int col = 0; col <= row; col++)
	        {
	            System.out.print("*");
	        }
	        System.out.println();
	    }
	}
	
	public static void printTriangleWithSpaces(int height)
	{
	    for(int row=0; row<height; row++)
	    {
	        for(int col = 0; col <= row; col++)
	        {
	            System.out.print("* ");
	        }
	        System.out.println();
	    }
	}

	public static void printTriangleR(int height)
	{
	    for(int row=0; row<height; row++)
	    {
	        for(int spaces = 1; spaces < height - row; spaces++)
	        {
	            System.out.print(" ");
	        }
	        for(int col = 0; col <= row; col++)
	        {
	            System.out.print("*");
	        }
	        System.out.println();
	    }
	}
	
	public static void printTriangleRWithSpaces(int height)
	{
	    for(int row=0; row<height; row++)
	    {
	        for(int spaces = 1; spaces < height - row; spaces++)
	        {
	            System.out.print("  ");
	        }
	        for(int col = 0; col <= row; col++)
	        {
	            System.out.print("* ");
	        }
	        System.out.println();
	    }
	}
	
	public static void main(String[] args) {
		
		printTriangle(5);
		printTriangleWithSpaces(5);
		printTriangleR(5);
		printTriangleRWithSpaces(5);

	}

}
