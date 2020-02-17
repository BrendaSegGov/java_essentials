package gNumericTypes;

public class Overflow {

	public static void main(String args[])
	{
		long n = 1;
	    for (long i = 0; i < 64; i++)
	    {
	    	System.out.print("n: " + n + "\n");
	        n = n * 2;
	    }
	}
}



