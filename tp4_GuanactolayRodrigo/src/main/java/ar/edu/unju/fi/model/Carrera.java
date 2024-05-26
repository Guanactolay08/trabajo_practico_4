package ar.edu.unju.fi.model;

public class Carrera {
	private short codigo;
	private String nombre;
	private byte cantidadAnios;
	private boolean estado;
	
	public Carrera() {
		// TODO Auto-generated constructor stub
	}

	public Carrera(short codigo, String nombre, byte cantidadAnios, boolean estado) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.cantidadAnios = cantidadAnios;
		this.estado = estado;
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

	public byte getCantidadAnios() {
		return cantidadAnios;
	}

	public void setCantidadAnios(byte cantidadAnios) {
		this.cantidadAnios = cantidadAnios;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Carrera [codigo=" + codigo + ", nombre=" + nombre + ", cantidadAnios=" + cantidadAnios + ", estado="
				+ estado + "]";
	}
	
	
}
