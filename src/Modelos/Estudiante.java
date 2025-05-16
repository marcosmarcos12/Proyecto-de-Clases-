package Modelos;

import java.util.ArrayList;
import java.util.List;

public class Estudiante {
	private String cedula;
	private String nombre;
	private String email;
	private EstadoEstudiante estado;
	private List<Archivo> informesMedicos;

	public Estudiante(String cedula, String nombre, String email) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.email = email;
		this.estado = EstadoEstudiante.CREADO;
		this.informesMedicos = new ArrayList<>();
	}

	// Getters y Setters

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public EstadoEstudiante getEstado() {
		return estado;
	}

	public void setEstado(EstadoEstudiante estado) {
		this.estado = estado;
	}

	public List<Archivo> getInformesMedicos() {
		return informesMedicos;
	}

	public void agregarInformeMedico(Archivo archivo) {
		this.informesMedicos.add(archivo);
	}

	@Override
	public String toString() {
		return "Estudiante{" +
				"cedula='" + cedula + '\'' +
				", nombre='" + nombre + '\'' +
				", email='" + email + '\'' +
				", estado=" + estado +
				", informesMedicos=" + informesMedicos.size() +
				'}';
	}
}
