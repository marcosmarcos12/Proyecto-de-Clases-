import java.time.LocalDateTime;
import java.util.UUID;

public class Instancia implements Cloneable {
	public enum Estado { CREADO, ELIMINADO }

	protected String id;
	protected Estudiante estudiante;
	protected LocalDateTime fechaInicio;
	protected LocalDateTime fechaFin;
	protected String descripcion;
	protected Estado estado;

	public Instancia(Estudiante estudiante, LocalDateTime fechaInicio, LocalDateTime fechaFin, String descripcion) {
		this.id = UUID.randomUUID().toString();
		this.estudiante = estudiante;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.descripcion = descripcion;
		this.estado = Estado.CREADO;
	}

	public void modificar(LocalDateTime fechaInicio, LocalDateTime fechaFin, String descripcion) {
		if (fechaInicio != null) this.fechaInicio = fechaInicio;
		if (fechaFin != null) this.fechaFin = fechaFin;
		if (descripcion != null) this.descripcion = descripcion;
	}

	public void eliminar() {
		this.estado = Estado.ELIMINADO;
	}

	@Override
	public Instancia clone() {
		return new Instancia(this.estudiante, this.fechaInicio, this.fechaFin, this.descripcion);
	}

	@Override
	public String toString() {
		return "Instancia " + id + " para " + estudiante.getNombre() + " desde " + fechaInicio + " a " + fechaFin;
	}
}
