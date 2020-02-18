package src1.tareas;

import libs.Input;

public class HolaMundo {

	public static void main(String[] args) {
		Input.print("Escriba su mensaje: \n");
		String m = Input.get_string();
		Input.print("Quiere escribir su saludo en Mayuscula: \n");
		String sa = Input.get_string();
		if (sa.equals("Y")) {
			Input.print(m.toUpperCase());
		
		}
		else if
			(sa.equals("N")) {
			Input.print(m.toLowerCase());
		}
			else {
			
			Input.print("Error ingresan y o n");
			}
					
	}

}
