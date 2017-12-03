package com.flores.proyecto.model;

public class Producto {
	
	private String codigo_barras;
	private String nombre;
	private double peso;
	private String imagen;
	private double precio;
	private String detalle;
	private int estado;
	private int oferta;
	private int categoria_idcategoria;
	private int almacen_idAlmacen;
	private int estante_nroEstante1;
	
	Almacen almacen = new Almacen();
	
	public Almacen getAlmacen() {
		return almacen;
	}
	public void setAlmacen(Almacen almacen) {
		this.almacen = almacen;
	}
	
	Categoria categoria = new Categoria();
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	Estante estante = new Estante();
	public Estante getEstante() {
		return estante;
	}
	public void setEstante(Estante estante) {
		this.estante = estante;
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
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
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
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public int getOferta() {
		return oferta;
	}
	public void setOferta(int oferta) {
		this.oferta = oferta;
	}
	public Producto(String codigo_barras, String nombre, double peso, String imagen, double precio, String detalle,
			int estado, int oferta, Almacen almacen, Categoria categoria) {
		super();
		this.codigo_barras = codigo_barras;
		this.nombre = nombre;
		this.peso = peso;
		this.imagen = imagen;
		this.precio = precio;
		this.detalle = detalle;
		this.estado = estado;
		this.oferta = oferta;
		this.almacen = almacen;
		this.categoria = categoria;
	}
	public Producto() {
		super();
	}
	@Override
	public String toString() {
		return "Producto [codigo_barras=" + codigo_barras + ", nombre=" + nombre + ", peso=" + peso + ", imagen="
				+ imagen + ", precio=" + precio + ", detalle=" + detalle + ", estado=" + estado + ", oferta=" + oferta
				+ ", almacen=" + almacen + ", categoria=" + categoria + "]";
	}
	public int getCategoria_idcategoria() {
		return categoria_idcategoria;
	}
	public void setCategoria_idcategoria(int categoria_idcategoria) {
		this.categoria_idcategoria = categoria_idcategoria;
	}
	public int getAlmacen_idAlmacen() {
		return almacen_idAlmacen;
	}
	public void setAlmacen_idAlmacen(int almacen_idAlmacen) {
		this.almacen_idAlmacen = almacen_idAlmacen;
	}
	public int getEstante_nroEstante1() {
		return estante_nroEstante1;
	}
	public void setEstante_nroEstante1(int estante_nroEstante1) {
		this.estante_nroEstante1 = estante_nroEstante1;
	}
	
	
}
