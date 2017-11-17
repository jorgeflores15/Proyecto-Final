package com.flores.proyecto.model;

public class Usuario {

	private String id_usuario;
	private String nombres;
	private String avatar;
	private String correo;
	private String rol;
	private String usuario;
	private String password;
	
	
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
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Usuario() {
		super();
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Usuario(String id_usuario, String nombres, String avatar, String correo, String rol, String usuario,
			String password) {
		super();
		this.id_usuario = id_usuario;
		this.nombres = nombres;
		this.avatar = avatar;
		this.correo = correo;
		this.rol = rol;
		this.usuario = usuario;
		this.password = password;
	}
	@Override
	public String toString() {
		return "Usuario [id_usuario=" + id_usuario + ", nombres=" + nombres + ", avatar=" + avatar + ", correo="
				+ correo + ", rol=" + rol + ", usuario=" + usuario + ", password=" + password + "]";
	}
}
