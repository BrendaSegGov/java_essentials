package src2.tareas;

import libs.Input;

public class InicialesDificil {

	public static void main(String[] args) {
		Input.print("Dame tu nombre");
		String nombreCompleto = Input.get_string();
		//Comparacion de caracteres y se checa si es mayuscula
		String[] nombresIndividuales = nombreCompleto.split(" ");
		for(int posicion = 0; posicion < nombresIndividuales.length; posicion++) {
			String nombreActual = nombresIndividuales[posicion];
			char caracteractual = nombreActual.charAt(0);
			String Inicial = caracteractual+"";
			
			
			Input.print(Inicial.toUpperCase());	

	}

}
}
