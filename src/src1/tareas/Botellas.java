package src1.tareas;

import libs.Input;

public class Botellas {

	public static void main(String[] args) {
		//Preguntar por los minutos en la ducha
		Input.print("Minutos: ");
		int m =	Input.get_positive_int();
		
		
		//hacer la multiplicacion
		int botellas = m * 12;
		//Imprimir resultados
		Input.print("Botellas: " + botellas);
		
		
		
	}

}
