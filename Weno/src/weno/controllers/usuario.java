package weno.controllers;

public class usuario {

	public String name;
	public String passs;
	boolean estado;
	
	
	public usuario(String name, String passs, boolean estado ) {
		this.name = name ;
		this.passs= passs;
		this.estado = estado;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPasss() {
		return passs;
	}


	public void setPasss(String passs) {
		this.passs = passs;
	}


	public boolean isEstado() {
		return estado;
	}


	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	
	
	
}
