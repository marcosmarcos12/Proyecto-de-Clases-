package Modelos;

import java.time.LocalDateTime;
import java.util.List;

public class Incidencia {
	private String id;
	private Estudiante estudiante;
	private String lugar;
	private List<String> personasInvolucradas;
	private String responsableRegistro;
	private LocalDateTime fechaHora;
	private String descripcion;

	public Incidencia(String id, Estudiante estudiante, String lugar, List<String> personasInvolucradas,
					  String responsableRegistro, LocalDateTime fechaHora, String descripcion) {
		this.id = id;
		this.estudiante = estudiante;
		this.lugar = lugar;
		this.personasInvolucradas = personasInvolucradas;
		this.responsableRegistro = responsableRegistro;
		this.fechaHora = fechaHora;
		this.descripcion = descripcion;
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

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public List<String> getPersonasInvolucradas() {
		return personasInvolucradas;
	}

	public void setPersonasInvolucradas(List<String> personasInvolucradas) {
		this.personasInvolucradas = personasInvolucradas;
	}

	public String getResponsableRegistro() {
		return responsableRegistro;
	}

	public void setResponsableRegistro(String responsableRegistro) {
		this.responsableRegistro = responsableRegistro;
	}

	public LocalDateTime getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(LocalDateTime fechaHora) {
		this.fechaHora = fechaHora;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
