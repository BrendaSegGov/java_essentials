package src4.tareas;

public class AmazonCategorias {

		String nombre;
		String marca;
		String descripcion;
		String categoria;
		float precio;
		int calificacion;
		boolean disponibilidad;
		
		public AmazonCategorias() {}//Constructor vacio 
		 
		public AmazonCategorias(String nombreProducto, String marca, String desc, String cat,
				float precio, int calificacion, boolean disponibilidad) {
			this.nombre = nombreProducto;
		}
		
	public void comprar() {
		
		if(disponibilidad==true && calificacion>5)
			System.out.println("Comprado");
		else if (precio>500)
			System.out.println("Agregar a Wishlist");
		else if(precio >500 && calificacion != 5)
			System.out.println("Agregar a Wishlist");
	}
	public void agregarCarrito() {
			if (disponibilidad==true && calificacion>5)
				System.out.println("Agregar a Carrito");
	}

	public void agregarWishlist() {
		if (disponibilidad==true && calificacion==5);
		System.out.println("Agregalo a tu Wishlist");
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public int getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}
	public boolean isDisponibilidad() {
		return disponibilidad;
	}
	public void setDisponibilidad(boolean disponibilidad) {
		this.disponibilidad = disponibilidad;
	}
	//Para mandar llamar los atributos
	public String toString() {
		return "[ Nombre: " + this.getNombre() + ", Marca: " + this.getMarca() + "]";
	}

	

}
