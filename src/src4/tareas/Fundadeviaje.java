package src4.tareas;

public class Fundadeviaje extends AmazonCategorias {
	double capacidadAlmacenaje;
	
	public Fundadeviaje() {
		 super();
		 super.nombre="Funda Viaje";
		 super.marca="";
		 super.precio=0;
		 super.calificacion=0;
		 super.descripcion="";
		 super.disponibilidad= true;
		 

	}
	public void guardarObjetos() {
		
	}
	public double getCapacidadAlmacenaje() {
		return capacidadAlmacenaje;
	}
	public void setCapacidadAlmacenaje(double capacidadAlmacenaje) {
		this.capacidadAlmacenaje = capacidadAlmacenaje;
	}

}
