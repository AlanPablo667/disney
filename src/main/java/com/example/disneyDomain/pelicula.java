package com.example.disneyDomain;

public class pelicula {
private String nombre;

public pelicula() {
	
}
public pelicula (String nombre) {
	this.nombre= nombre;
	
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
@Override
public String toString() {
	return  this.nombre;
}


}
