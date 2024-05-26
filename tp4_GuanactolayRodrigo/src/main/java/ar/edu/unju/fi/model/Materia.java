package ar.edu.unju.fi.model;

public class Materia {
	private short codigo;
	private String nombre;
	private String curso;
	private short cantidadHoras;
	private Modalidad modalidad;
	private Docente docente;
	private String carrera;
	
	public enum Modalidad{
		PRESENCIAL, VIRTUAL
	}
	
	public Materia() {
		// TODO Auto-generated constructor stub
	}

	public Materia(short codigo, String nombre, String curso, short cantidadHoras, Modalidad modalidad, Docente docente,
			String carrera) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.curso = curso;
		this.cantidadHoras = cantidadHoras;
		this.modalidad = modalidad;
		this.docente = docente;
		this.carrera = carrera;
	}

	public short getCodigo() {
		return codigo;
	}

	public void setCodigo(short codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public short getCantidadHoras() {
		return cantidadHoras;
	}

	public void setCantidadHoras(short cantidadHoras) {
		this.cantidadHoras = cantidadHoras;
	}

	public Modalidad getModalidad() {
		return modalidad;
	}

	public void setModalidad(Modalidad modalidad) {
		this.modalidad = modalidad;
	}

	public Docente getDocente() {
		return docente;
	}

	public void setDocente(Docente docente) {
		this.docente = docente;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	@Override
	public String toString() {
		return "Materia [codigo=" + codigo + ", nombre=" + nombre + ", curso=" + curso + ", cantidadHoras="
				+ cantidadHoras + ", modalidad=" + modalidad + ", docente=" + docente + ", carrera=" + carrera + "]";
	}
	
	
}
