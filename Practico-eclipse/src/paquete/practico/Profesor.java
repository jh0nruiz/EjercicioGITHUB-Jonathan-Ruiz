package paquete.practico;

public class Profesor extends Persona {

	private String asignatura;
	private String nivel;

	public Profesor(String nombre, String edad, String asignatura, String nivel) {
		super(nombre, edad);
		this.asignatura = asignatura;
		this.nivel = nivel;
	}

	public Profesor(String nombre, String edad) {
		super(nombre, edad);
		this.asignatura = "JS";
		this.nivel = "Basico";
	}

	@Override
	public void obtDetalles() {
		super.obtDetalles();
		System.out.println("asignatura " + asignatura);
		System.out.println("nivel " + nivel);

	}

}
