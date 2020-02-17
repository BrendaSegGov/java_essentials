package src1.tareas;

import libs.Input;

public class MarioFacilillo {

	public static void main(String[] args) {
		//pprimero pedimos la altura
		Input.print("Altura: ");
		int altura = Input.get_positive_int();
		//en un cliclo, dibujamos cada renglon
		for (int r=1; r<=altura; r+=1) {
			dibujarespacios(r,altura);
			dibujarGatos (r);
			
		}
	}

	private static void dibujarGatos(int r) {
		//System.out.println("renglon " + r);
		int ng= r+1;
		for (int i=1; i<=ng; i+=1) {
			Input.print("#");
		}
		Input.print("\n");
	}
	private static void dibujarespacios(int r, int altura) {
		//System.out.println("renglon " + r);
		int ne= altura-r;
		for (int x=1; x<=ne; x+=1) {
			Input.print(" ");
		}
	}

}
