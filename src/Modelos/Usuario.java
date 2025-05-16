package Modelos;

public class Usuario extends Persona {
	private Rol rol;

	public Usuario(String nombre, String cedula, String correo, Rol rol) {
		super(nombre, cedula, correo);
		this.rol = rol;
	}

	public Rol getRol() {
		return rol;
	}
}
