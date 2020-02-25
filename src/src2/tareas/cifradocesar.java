package src2.tareas;

import libs.Input;
// Cifrado Cesar
public class cifradocesar {

	public static void main(String[] args) {
	//Obtener valor inicial del mensaje y de la cantidad del cifrado
		Input.print("Mensaje a cifrar: \n");
		String m = Input.get_string();
		
	//Declarar arreglo de abcdario y mensaje cifrado
		String mcifrado="";
		String[] abecedario = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	
	//Ciclo iterativo para avance letra por letra.	
		for(int posicion = 0; posicion < m.length(); posicion++) {
		String letram = m.charAt(posicion)+"";
		
	//ciclo para busqueda de letra en arreglo abecedario
		for(int letra=0;letra<abecedario.length;letra++) {
			if(letram.equals(abecedario[letra])) {
				mcifrado=mcifrado+abecedario[letra+5];
			}
		}
			
	        
	    
		}
		Input.print("Mensaje cifrado: "+mcifrado );
	}
}

