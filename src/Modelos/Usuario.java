package Modelos;

public class Usuario {
	private String username;
	private String password; // Deberá almacenarse encriptado en futura implementación
	private Rol rol;

	public Usuario(String username, String password, Rol rol) {
		this.username = username;
		this.password = password;
		this.rol = rol;
	}

	// Getters y setters
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}
}
