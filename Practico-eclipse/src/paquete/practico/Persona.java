package paquete.practico;

public class Persona {

	private String nombre;
	private String edad;

	public void obtDetalles() {

		System.out.println("nombre "+ nombre);
		System.out.println("edad "+ edad);

	}
	
	public Persona(String nombre, String edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	
	
}
