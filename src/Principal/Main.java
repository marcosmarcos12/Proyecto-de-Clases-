import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		// Crear usuarios
		Administrador admin = new Administrador("12345678", "Ana Admin", "ana@utec.edu.uy");
		Psicopedagogo psicopedagogo = new Psicopedagogo("87654321", "Pedro Psic", "pedro@utec.edu.uy");

		// Crear estudiante
		Estudiante estudiante = new Estudiante("11223344", "Juan Perez", LocalDate.of(2000, 5, 20));

		// Modificar info estudiante
		estudiante.modificarInfo("Juan P.");

		// Agregar archivo
		Archivo archivo = new Archivo("InformeMedico", "pdf", new byte[]{1, 2, 3});
		estudiante.agregarArchivo(archivo);

		// Crear instancia
		Instancia instancia = new Instancia(estudiante, LocalDateTime.now(), LocalDateTime
