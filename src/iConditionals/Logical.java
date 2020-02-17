package iConditionals;

import libs.Input;

public class Logical {

	public static void main(String args[])
	{
		Input.print("Quieres aprender Java?");
		int c = Input.get_char();
	    if (c == 'Y' || c == 'y')//Barras indican O
	    							//&& indican una condicion Y
	    {
	    	System.out.print("yes\n");
	    }
	    else if (c == 'N' || c == 'n')
	    {
	    	System.out.print("no\n");
	    }
	    else
	    {
	    	System.out.print("error\n");
	    }
	
	}
}



