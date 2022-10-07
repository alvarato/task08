package main;

import main.Electrodomestico.ConsumoE;

public class Serie {

	private String titulo;
	private int temporadas;
	private boolean entregado;
	private Genero genero;
	private Genero subGenero;
	private String creador;

	public Serie() {
		this.titulo = "";
		this.temporadas = 3;
		this.entregado = false;
		this.genero = Genero.SIN_ASIGNAR;
		this.subGenero = Genero.SIN_ASIGNAR;
		this.creador = "";
	}

	public Serie(String titulo, String creador) {
		super();
		this.titulo = titulo;
		this.creador = creador;
		this.temporadas = 3;
		this.entregado = false;
		this.genero = Genero.SIN_ASIGNAR;
		this.subGenero = Genero.SIN_ASIGNAR;
	}

	public Serie(String titulo, int temporadas, String genero, String subGenero, String creador) {
		super();
		this.titulo = titulo;
		this.temporadas = temporadas;
		this.genero = Genero.carga(genero);
		this.subGenero = Genero.carga(subGenero);
		this.creador = creador;
		this.entregado = false;
	}

	enum Genero {
		TERROR, SUSPENSO, ACCION, ROMANCE, COMEDIA, SIN_ASIGNAR;

		private static Genero carga(String s) {
			Genero aux = Enum.valueOf(Genero.class, s.toUpperCase());
			return aux;
		}
	}

	@Override
	public String toString() {
		return "\ntitulo: " + titulo + "\ntemporadas: " + temporadas + 
				"\nentregado: " + entregado + "\ngenero:"
				+ genero + "\nsubGenero: " + subGenero + "\ncreador:" + creador ;
	}

}
