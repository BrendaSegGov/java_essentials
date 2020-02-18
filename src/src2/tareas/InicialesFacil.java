package src2.tareas;

import libs.Input;

public class InicialesFacil {

	public static void main(String[] args) {
		//Obtener nombre con Mayuscula y espacio entre nombres
		Input.print("Dame tu nombre");
		String nombreCompleto = Input.get_string();
		//Comparacion de caracteres y se checa si es mayuscula
		
		for(int posicion = 0; posicion < nombreCompleto.length(); posicion++) {
			char caracteractual = nombreCompleto.charAt(posicion);
			
			if (Character.isUpperCase(caracteractual))
				Input.print(caracteractual);	



		}
		//Imprimen las inicial por inicial

	}

}
