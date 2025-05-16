import java.time.LocalDateTime;

public class Recordatorio extends Instancia {
	private boolean recurrente;
	private int frecuenciaDias; // si es recurrente, cada cuántos días se repite

	public Recordatorio(Estudiante estudiante, LocalDateTime fechaInicio, LocalDateTime fechaFin,
						String descripcion, boolean recurrente, int frecuenciaDias) {
		super(estudiante, fechaInicio, fechaFin, descripcion);
		this.recurrente = recurrente;
		this.frecuenciaDias = frecuenciaDias;
	}

	// Polimorfismo: sobrecarga para enviar alertas
	public void enviarAlerta() {
		enviarAlerta("email");
	}

	public void enviarAlerta(String metodo) {
		switch (metodo.toLowerCase()) {
			case "whatsapp":
				System.out.println("Alerta WhatsApp enviada para recordatorio " + id + " a " + estudiante.getNombre());
				break;
			case "email":
				System.out.println("Alerta email enviada para recordatorio " + id + " a " + estudiante.email);
				break;
			default:
				System.out.println("Método de alerta desconocido");
		}
	}

	public boolean esVencido() {
		return LocalDateTime.now().isAfter(fechaFin);
	}

	public String colorEstado() {
		return esVencido() ? "rojo" : "verde";
	}

	public Recordatorio crearNuevaInstanciaAlCumplirse() {
		if (recurrente) {
			LocalDateTime nuevaFechaInicio = fechaInicio.plusDays(frecuenciaDias);
			LocalDateTime nuevaFechaFin = fechaFin.plusDays(frecuenciaDias);
			return new Recordatorio(estudiante, nuevaFechaInicio, nuevaFechaFin, descripcion, true, frecuenciaDias);
		}
		return null;
	}
}
