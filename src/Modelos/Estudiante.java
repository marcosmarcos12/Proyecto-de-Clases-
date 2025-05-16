import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Estudiante {
	public enum Estado { CREADO, EN_SEGUIMIENTO, FINALIZADO, ELIMINADO }

	private String cedula;
	private String nombre;
	private LocalDate fechaNacimiento;
	private Estado estado;
	private List<Archivo> archivos;

	public Estudiante(String cedula, String nombre, LocalDate fechaNacimiento) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.estado = Estado.CREADO;
		this.archivos = new ArrayList<>();
	}

	// Sobrecarga para modificar info
	public void modificarInfo(String nombre) {
		this.nombre = nombre;
	}

	public void modificarInfo(String nombre, LocalDate fechaNacimiento) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}

	public void agregarArchivo(Archivo archivo) {
		String tipo = archivo.getTipo();
		if (!tipo.equals("jpg") && !tipo.equals("png") && !tipo.equals("pdf")) {
			throw new IllegalArgumentException("Formato de archivo no soportado");
		}
		archivos.add(archivo);
	}

	public void darDeBaja() {
		this.estado = Estado.ELIMINADO;
	}

	public List<Archivo> getArchivos() {
		return archivos;
	}

	public String getCedula() {
		return cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public Estado getEstado() {
		return estado;
	}

	@Override
	public String toString() {
		return "Estudiante " + nombre + " (CI: " + cedula + ") - Estado: " + estado;
	}
}
