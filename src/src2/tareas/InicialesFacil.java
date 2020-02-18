package src2.tareas;

import libs.Input;

public class InicialesFacil {

	public static void main(String[] args) {
		//Obtener nombre con Mayuscula y espacio entre nombres
		Input.print("Dame tu nombre");
		String nombreCompleto = Input.get_string();
		//Comparacion de caracteres y se checa si es mayuscula
		String[] nombresIndividuales = nombreCompleto.split(" ");
		for(int posicion = 0; posicion < nombresIndividuales.length; posicion++) {
			String nombreActual = nombresIndividuales[posicion];
			char caracteractual = nombreActual.charAt(0);
			
			Input.print(caracteractual);	



		}
		//Imprimen las inicial por inicial

	}

}
