package gNumericTypes;

import libs.Input;

public class EjemploFloat {
	//Divide numeros con decimales
	public static void main(String[] args) {
		float f = Input.get_float();
		
		float f2 = Input.get_float();
		
		Input.print("f/f2 = " + (f/f2));

	}

}
