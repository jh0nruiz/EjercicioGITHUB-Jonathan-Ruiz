package paquete.practico;


public class Grupo {
	private Estudiante estudiantes[];
	private Profesor profesor;

	public Grupo(Profesor profesor, Estudiante[] estudiantes) {
		this.profesor = profesor;
		this.estudiantes = estudiantes;
	}

	public void calificar() {
		for (Estudiante estudiante : estudiantes) {
			estudiante.setCalificacion(Math.random() * 10);

		}

	}

	private double calcularPro() {
		double promedio = 0;
		for (Estudiante estudiante : estudiantes) {
			promedio = promedio + estudiante.getCalificacion();
		}
		return promedio;
	}

	public void obtDetalles() {
		System.out.println("profesor");
		profesor.obtDetalles();
		System.out.println("estudiantes");
		for (Estudiante estudiante : estudiantes) {
			estudiante.obtDetalles();	
		}

	}

}
