package Modelos;

public class Archivo {
	private String nombre;
	private String tipo; // "jpg", "png", "pdf"
	private byte[] contenido;

	public Archivo(String nombre, String tipo, byte[] contenido) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.contenido = contenido;
	}

	// Getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public byte[] getContenido() {
		return contenido;
	}

	public void setContenido(byte[] contenido) {
		this.contenido = contenido;
	}
}
