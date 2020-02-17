package src1.tareas;

import libs.Input;

public class Buggy1 {

	public static void main(String[] args) {
	    int i = get_negative_int();
	    Input.print(i + " is a negative integer\n");
	}

	public static int get_negative_int()
	{
	    int n;
	    do
	    {
	        Input.print("n is ");
	        n = Input.get_int();
	      
	        if (n>=0) {
	        	Input.print("Error, Ingresa un dato negativo\n");
	        }
	    }
	    while (n >= 0);
	    return n;
	}
}
