public class Administrador extends Usuario {
	public Administrador(String cedula, String nombre, String email) {
		super(cedula, nombre, email, "administrador");
		asignarPermiso("gestionar_estudiantes");
		asignarPermiso("gestionar_instancias");
		asignarPermiso("gestionar_recordatorios");
		asignarPermiso("gestionar_incidencias");
		asignarPermiso("generar_reportes");
	}

	@Override
	public String mostrarInfo() {
		return "Administrador: " + nombre + " (" + cedula + ")";
	}
}
