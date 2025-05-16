import java.time.LocalDateTime;
import java.util.List;

public class Incidencia {
	private String id;
	private Estudiante estudiante;
	private String lugarOcurrencia;
	private List<String> personasInvolucradas;
	private Usuario responsableRegistro;
	private String descripcion;
	private LocalDateTime fechaHora;

	public Incidencia(String id, Estudiante estudiante, String lugarOcurrencia,
					  List<String> personasInvolucradas, Usuario responsableRegistro,
					  String descripcion, LocalDateTime fechaHora) {
		this.id = id;
		this.estudiante = estudiante;
		this.lugarOcurrencia = lugarOcurrencia;
		this.personasInvolucradas = personasInvolucradas;
		this.responsableRegistro = responsableRegistro;
		this.descripcion = descripcion;
		this.fechaHora = fechaHora;
	}

	@Override
	public String toString() {
		return "Incidencia ID: " + id + ", Estudiante: " + estudiante.getNombre() +
				", Lugar: " + lugarOcurrencia + ", Fecha: " + fechaHora;
	}
}
