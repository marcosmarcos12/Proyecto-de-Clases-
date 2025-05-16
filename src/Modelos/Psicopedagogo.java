public class Psicopedagogo extends Usuario {
	public Psicopedagogo(String cedula, String nombre, String email) {
		super(cedula, nombre, email, "psicopedagogo");
		asignarPermiso("ver_estudiantes");
		asignarPermiso("crear_recordatorios");
		asignarPermiso("registrar_incidencias");
	}

	@Override
	public String mostrarInfo() {
		return "Psicopedagogo: " + nombre + " (" + cedula + ")";
	}
}
