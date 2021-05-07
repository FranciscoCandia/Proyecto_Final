package com.senati.eti.model;

public class Publicacion {
	private String titulo;
	private String autor;
	private int tipo;
	
	public String getTitulo() {
		return this.titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return this.autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getTipo() {
		return this.tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public Publicacion() {
	}
	public Publicacion(String titulo, String autor, int tipo) {
		this.titulo = titulo;
		this.autor = autor;
		this.tipo = tipo;
	}
	public String MostrarTipo() {
		return(this.tipo==1 ? "Libro":"Revista");
	}
	
	
}
