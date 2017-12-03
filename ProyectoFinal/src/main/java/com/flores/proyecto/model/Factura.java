package com.flores.proyecto.model;

public class Factura {

	private String num_factura;
	private String fecha;
	private int monto;
	private int peso;
	
	Usuario usuario = new Usuario();
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	Producto producto = new Producto();
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
	public String getNum_factura() {
		return num_factura;
	}
	public void setNum_factura(String num_factura) {
		this.num_factura = num_factura;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public int getMonto() {
		return monto;
	}
	public void setMonto(int monto) {
		this.monto = monto;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public Factura(String num_factura, String fecha, int monto, int peso) {
		super();
		this.num_factura = num_factura;
		this.fecha = fecha;
		this.monto = monto;
		this.peso = peso;
	}
	public Factura() {
		super();
	}
	@Override
	public String toString() {
		return "Factura [num_factura=" + num_factura + ", fecha=" + fecha + ", monto=" + monto + ", peso=" + peso + "]";
	}
}
