package paquete.practico;

public class Estudiante extends Persona {

	private double calificacion;

	public Estudiante(String nombre, String edad) {
		super(nombre, edad);
	}

	@Override
	public void obtDetalles() {
		super.obtDetalles();
		System.out.println("calificacion " + calificacion);

	}

	public double getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}

}
