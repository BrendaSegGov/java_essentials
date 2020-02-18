package src1.tareas;

import libs.Input;

public class IntentoMonedas {

	public static void main(String[] args) {
		//Pedir cuanto debo
		Input.print("Cuanto dinero te debo: \n");
		//Guardar cantidad a deber
		float d = Input.get_float();
//Operacion matematica de comparacion
		// Cantidad de monedas de a 10
		int cant10=0;
		for(int ops=1;d>0;ops++) {
		if(d%10>0) {
			cant10=1+cant10;
		}
		d=d-(cant10*10);
		}
		Input.print("Te devolvere "+cant10+" Monedas de 10.");
		//* for (int a=10; d>0; a++) {
		//	input
		//	
		//} lo que hizo mi cholatita */
		
		// Necesito un contador
		//Necesito un acumulador

	}

}
