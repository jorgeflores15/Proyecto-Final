package com.flores.proyecto.model;

public class Producto {
	
	private String codigo_barras;
	private String nombre;
	private String categoria;
	private double peso;
	private int estado;
	private double precio;
	private String detalle;
	private String imagen;
	
	public Producto(String codigo_barras, String nombre, String categoria, double peso, int estado, double precio,
			String detalle, String imagen) {
		super();
		this.codigo_barras = codigo_barras;
		this.nombre = nombre;
		this.categoria = categoria;
		this.peso = peso;
		this.estado = estado;
		this.precio = precio;
		this.detalle = detalle;
		this.imagen = imagen;
	}
	public Producto() {
		super();
	}
	
	public String getCodigo_barras() {
		return codigo_barras;
	}
	public void setCodigo_barras(String codigo_barras) {
		this.codigo_barras = codigo_barras;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	@Override
	public String toString() {
		return "Producto [codigo_barras=" + codigo_barras + ", nombre=" + nombre + ", categoria=" + categoria
				+ ", peso=" + peso + ", estado=" + estado + ", precio=" + precio + ", detalle=" + detalle + ", imagen="
				+ imagen + "]";
	}
}
