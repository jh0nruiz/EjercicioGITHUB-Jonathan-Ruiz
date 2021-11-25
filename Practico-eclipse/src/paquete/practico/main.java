package paquete.practico;

public class main {

	public static void main(String[] args) {
		Estudiante[] estudiante= new Estudiante[6];
		estudiante[0]= new Estudiante("Gloria" ,"30");
		estudiante[1]= new Estudiante("fabian", "10");
		estudiante[2]= new Estudiante("felipe", "18");
		estudiante[3]= new Estudiante("Andres", "30");
		estudiante[4]= new Estudiante("Andres", "60");
		estudiante[5]= new Estudiante("jorge", "5");


		Profesor profesor = new Profesor("Luis Felipe", "48");
		Grupo grupo = new Grupo(profesor, estudiante);
		grupo.calificar();
		grupo.obtDetalles();
		

	}

}
