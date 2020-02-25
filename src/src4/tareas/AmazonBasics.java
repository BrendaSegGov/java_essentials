package src4.tareas;


public class AmazonBasics {
	
		
	public static void main(String[] args) {
			
		
		System.out.println("Articulo:");
		AmazonCategorias articulo = new AmazonCategorias();
		articulo.setNombre("Funda de Viaje para Nintendo Switch");
		articulo.setMarca("Amazon Basics");
		articulo.setDescripcion("Funda de Viaje para consola nintendo Switch color verde");
		articulo.setCategoria("Eletronica");
		articulo.setPrecio(460.0f);
		articulo.setCalificacion(5);
		articulo.setDisponibilidad(true);
		
		System.out.print(articulo);
		

	}

}
