package com.flores.proyecto.model;

public class Usuario {

	private String id_usuario;
	private String nombres;
	private String correo;
	private String avatar;
	private int estado;
	
	public String getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(String id_usuario) {
		this.id_usuario = id_usuario;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public Usuario(String id_usuario, String nombres, String correo, String avatar, int estado) {
		super();
		this.id_usuario = id_usuario;
		this.nombres = nombres;
		this.correo = correo;
		this.avatar = avatar;
		this.estado = estado;
	}
	public Usuario() {
		super();
	}
	@Override
	public String toString() {
		return "Usuario [id_usuario=" + id_usuario + ", nombres=" + nombres + ", correo=" + correo + ", avatar="
				+ avatar + ", estado=" + estado + "]";
	}
	
}
