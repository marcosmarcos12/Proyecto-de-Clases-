package Principal;

import Modelos.*;

public class Main {
	public static void main(String[] args) {
		System.out.println("Sistema iniciado");

		// Ejemplo de creación de estudiante
		Estudiante estudiante = new Estudiante("12345678", "Juan Pérez", "juan.perez@email.com");
		System.out.println(estudiante);
	}
}
