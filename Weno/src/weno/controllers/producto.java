package weno.controllers;

public class producto {
	
	public String Nombre ;
	public String Descripcion;
	public int Precio;
	public int existencia;
	public int idProducto;
	
	
	public producto (){};
	
	
	
	void crearProducto () {};
	
	
	
	void eliminarProducto () {};
	
	
	void verProducto () {};
	
	
	
	void actualizarProducto() {}



	public String getNombre() {
		return Nombre;
	}



	public void setNombre(String nombre) {
		Nombre = nombre;
	}



	public String getDescripcion() {
		return Descripcion;
	}



	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}



	public int getPrecio() {
		return Precio;
	}



	public void setPrecio(int precio) {
		Precio = precio;
	}



	public int getExistencia() {
		return existencia;
	}



	public void setExistencia(int existencia) {
		this.existencia = existencia;
	}



	public int getIdProducto() {
		return idProducto;
	}



	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	};
	
	
	
	
	
	
	
	
	

}
