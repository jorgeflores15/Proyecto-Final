package com.flores.proyecto.model;

public class Almacen {
 
	private int idAlmacen;
	private int nro_productos;
	private int nro_proveedores;
	
	public int getIdAlmacen() {
		return idAlmacen;
	}
	public void setIdAlmacen(int idAlmacen) {
		this.idAlmacen = idAlmacen;
	}
	public int getNro_productos() {
		return nro_productos;
	}
	public void setNro_productos(int nro_productos) {
		this.nro_productos = nro_productos;
	}
	public int getNro_proveedores() {
		return nro_proveedores;
	}
	public void setNro_proveedores(int nro_proveedores) {
		this.nro_proveedores = nro_proveedores;
	}
	public Almacen(int idAlmacen, int nro_productos, int nro_proveedores) {
		super();
		this.idAlmacen = idAlmacen;
		this.nro_productos = nro_productos;
		this.nro_proveedores = nro_proveedores;
	}
	public Almacen() {
		super();
	}
	@Override
	public String toString() {
		return "Almacen [idAlmacen=" + idAlmacen + ", nro_productos=" + nro_productos + ", nro_proveedores="
				+ nro_proveedores + "]";
	}
}
