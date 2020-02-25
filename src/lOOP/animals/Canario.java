package lOOP.animals;

public class Canario extends Animal {
	
	public Canario() {
		super();
		super.esMascota = true;
		super.edad = 0;
		super.nombre = "";
		super.tieneAlas = true;
		super.puedeVolar = true;
	}
	
	public void hablar() {
		System.out.println("chirp, chirp");
	}
	public void comer() {
		System.out.println("Me encanta el alpistle!");
	}
	public void moverse() {
		System.out.println("revoloteo de aqui para alla.");
	}
}
