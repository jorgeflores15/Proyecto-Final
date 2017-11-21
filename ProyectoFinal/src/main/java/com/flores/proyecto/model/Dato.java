package com.flores.proyecto.model;

public class Dato {
	
	private int productosV;
	private int productosD;
	private int usuarios;
	private int ofertas;
	
	public int getProductosV() {
		return productosV;
	}
	public void setProductosV(int productosV) {
		this.productosV = productosV;
	}
	public int getProductosD() {
		return productosD;
	}
	public void setProductosD(int productosD) {
		this.productosD = productosD;
	}
	public int getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(int usuarios) {
		this.usuarios = usuarios;
	}
	
	public Dato() {
		super();
	}
	public int getOfertas() {
		return ofertas;
	}
	public void setOfertas(int ofertas) {
		this.ofertas = ofertas;
	}
	public Dato(int productosV, int productosD, int usuarios, int ofertas) {
		super();
		this.productosV = productosV;
		this.productosD = productosD;
		this.usuarios = usuarios;
		this.ofertas = ofertas;
	}
}
