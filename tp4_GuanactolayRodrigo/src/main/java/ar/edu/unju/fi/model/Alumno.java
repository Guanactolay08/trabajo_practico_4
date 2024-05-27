package ar.edu.unju.fi.model;

import java.time.LocalDate;

public class Alumno {
	private int dni;
	private String nombre;
	private String apellido;
	private String email;
	private int numeroTelefono;
	private LocalDate fechaNacimiento;
	private String domicilio;
	private short lu;
	
	public Alumno() {
		// TODO Auto-generated constructor stub
	}

	public Alumno(int dni, String nombre, String apellido, String email, int numeroTelefono, LocalDate fechaNacimiento,
			String domicilio, short lu) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.numeroTelefono = numeroTelefono;
		this.fechaNacimiento = fechaNacimiento;
		this.domicilio = domicilio;
		this.lu = lu;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
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

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public short getLu() {
		return lu;
	}

	public void setLu(short lu) {
		this.lu = lu;
	}

	@Override
	public String toString() {
		return "Alumno [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email
				+ ", numeroTelefono=" + numeroTelefono + ", fechaNacimiento=" + fechaNacimiento + ", domicilio="
				+ domicilio + ", lu=" + lu + "]";
	}
	
	
	
	
}
