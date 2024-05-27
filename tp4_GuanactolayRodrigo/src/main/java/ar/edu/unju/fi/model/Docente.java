package ar.edu.unju.fi.model;

public class Docente {
	private String legajo;
	private String nombre;
	private String apellido;
	private String email;
	private int numeroTelefono;
	
	public Docente() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Docente(String legajo, String nombre, String apellido, String email, int numeroTelefono) {
		this.legajo = legajo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.numeroTelefono = numeroTelefono;
	}


	public String getLegajo() {
		return legajo;
	}

	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getNumeroTelefono() {
		return numeroTelefono;
	}

	public void setNumeroTelefono(int numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}


	@Override
	public String toString() {
		return "Docente [legajo=" + legajo + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email
				+ ", numeroTelefono=" + numeroTelefono + "]";
	}
	
	
}
