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
		int cant25=0;
		for(int x=1;d>0;x++) {
		if(d%25>0) {
			cant25=1+cant10;
		}
		d=d-(cant25*10);
		}
		Input.print("Te devolvere "+cant10+" Monedas de 10.");
		//* for (int a=10; d>0; a++) {
		//	input
		//	
		
		
		// Necesito un contador
		//Necesito un acumulador

	}

}
