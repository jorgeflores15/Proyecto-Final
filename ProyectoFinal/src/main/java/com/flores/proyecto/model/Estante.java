package com.flores.proyecto.model;

public class Estante {

	private int nroEstante;
	private String nroSector;
	
	public int getNroEstante() {
		return nroEstante;
	}
	public void setNroEstante(int nroEstante) {
		this.nroEstante = nroEstante;
	}
	public String getNroSector() {
		return nroSector;
	}
	public void setNroSector(String nroSector) {
		this.nroSector = nroSector;
	}
	public Estante(int nroEstante, String nroSector) {
		super();
		this.nroEstante = nroEstante;
		this.nroSector = nroSector;
	}
	public Estante() {
		super();
	}
	@Override
	public String toString() {
		return "Estante [nroEstante=" + nroEstante + ", nroSector=" + nroSector + "]";
	}
}
