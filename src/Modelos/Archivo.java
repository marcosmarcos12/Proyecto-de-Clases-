import java.util.HashSet;
import java.util.Set;

public abstract class Usuario {
	protected String cedula;
	protected String nombre;
	protected String email;
	protected String rol;
	protected Set<String> permisos;
	protected String contrasenaHash;

	public Usuario(String cedula, String nombre, String email, String rol) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.email = email;
		this.rol = rol;
		this.permisos = new HashSet<>();
	}

	public void asignarPermiso(String permiso) {
		permisos.add(permiso);
	}

	public void removerPermiso(String permiso) {
		permisos.remove(permiso);
	}

	public boolean verificarPermiso(String permiso) {
		return permisos.contains(permiso);
	}

	public void establecerContrasena(String contrasena) {
		this.contrasenaHash = Integer.toString(contrasena.hashCode());
	}

	public boolean verificarContrasena(String contrasena) {
		return this.contrasenaHash.equals(Integer.toString(contrasena.hashCode()));
	}

	public abstract String mostrarInfo();
}
