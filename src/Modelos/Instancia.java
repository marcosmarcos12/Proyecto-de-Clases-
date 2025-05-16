package Modelos;

import java.time.LocalDateTime;
import java.util.UUID;

public class Instancia {
	private String id;
	private Estudiante estudiante;
	private LocalDateTime fechaInicio;
	private LocalDateTime fechaFin;
	private EstadoInstancia estado;

	public Instancia(Estudiante estudiante, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		this.id = UUID.randomUUID().toString();
		this.estudiante = estudiante;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.estado = EstadoInstancia.CREADO;
	}

	// Getters y setters
	public String getId() {
		return id;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	public LocalDateTime getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDateTime fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDateTime getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDateTime fechaFin) {
		this.fechaFin = fechaFin;
	}

	public EstadoInstancia getEstado() {
		return estado;
	}

	public void setEstado(EstadoInstancia estado) {
		this.estado = estado;
	}

	public Instancia clonar() {
		return new Instancia(this.estudiante, this.fechaInicio, this.fechaFin);
	}

	@Override
	public String toString() {
		return "Instancia{" +
				"id='" + id + '\'' +
				", estudiante=" + estudiante.getNombre() +
				", fechaInicio=" + fechaInicio +
				", fechaFin=" + fechaFin +
				", estado=" + estado +
				'}';
	}
}
