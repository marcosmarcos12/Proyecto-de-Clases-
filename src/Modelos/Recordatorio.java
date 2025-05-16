package Modelos;

import java.time.LocalDateTime;

public class Recordatorio {
	private String id;
	private Instancia instancia;
	private LocalDateTime fecha;
	private boolean recurrente;
	private Frecuencia frecuencia;
	private EstadoRecordatorio estado;

	public Recordatorio(String id, Instancia instancia, LocalDateTime fecha, boolean recurrente, Frecuencia frecuencia) {
		this.id = id;
		this.instancia = instancia;
		this.fecha = fecha;
		this.recurrente = recurrente;
		this.frecuencia = frecuencia;
		this.estado = EstadoRecordatorio.ACTIVO;
	}

	// Getters y setters

	public String getId() {
		return id;
	}

	public Instancia getInstancia() {
		return instancia;
	}

	public void setInstancia(Instancia instancia) {
		this.instancia = instancia;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public boolean isRecurrente() {
		return recurrente;
	}

	public void setRecurrente(boolean recurrente) {
		this.recurrente = recurrente;
	}

	public Frecuencia getFrecuencia() {
		return frecuencia;
	}

	public void setFrecuencia(Frecuencia frecuencia) {
		this.frecuencia = frecuencia;
	}

	public EstadoRecordatorio getEstado() {
		return estado;
	}

	public void setEstado(EstadoRecordatorio estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Recordatorio{" +
				"id='" + id + '\'' +
				", instanciaId='" + instancia.getId() + '\'' +
				", fecha=" + fecha +
				", recurrente=" + recurrente +
				", frecuencia=" + frecuencia +
				", estado=" + estado +
				'}';
	}
}
