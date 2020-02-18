package src1.tareas;

import libs.Input;

public class Monedas {

	public static void main(String[] args) {
		Input.print("Introduce el dinero en fraccion \n");
		double cambiototal= Input.get_double();
		int centavos = (int) ( cambiototal * 100.0);
		int numeroMonedas = 0;
		int sobrante = centavos;
		int[] monedas = {25, 10, 5, 1};
		
		for(int i = 0; i < monedas.length; i++) {
			numeroMonedas=numeroMonedas + centavos/ monedas[i];
			centavos = centavos%monedas[i];
		}
		

		//comienzan las divisiones por cada tipo de moneda
		
		
		/*int numeromonedas10 = sobrante/10;
		sobrante= sobrante%10;
		
		int numeromonedas5 = sobrante/5;
		sobrante= sobrante%5;
		
		int numeromonedas1 = sobrante/1;
		sobrante= sobrante%1;*/
		
		Input.print("Total de Monedas: "+ (numeroMonedas));
		
	}

}
