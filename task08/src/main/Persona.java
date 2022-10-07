package main;

import javax.swing.JOptionPane;
//Profe tiene el metodo toString para que muestre los datos de la persona 
//(true = hombre false = mujer)

public class Persona {
	
	private String nombre;
	private int edad;
	private String dni;
	private boolean sexo;
	private double peso;
	private double altura;	
	
	public Persona() {
		this.nombre = "";
		this.edad = 0;
		this.sexo = true;
		this.peso = 0.0;
		this.altura = 0.0;
	}
	
	public Persona(String nombre, int edad, boolean sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.peso = 0.0;
		this.altura = 0.0;
	}

	public Persona(String nombre, int edad, String dni, boolean sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}
	
	public String toString() {
		String s = (sexo)? "hombre":"mujer";
		return "\nnombre: " + this.nombre + "\n" + "edad: " + this.edad +
				"\n" + "DNI: " + this.dni + "\n" + "sexo: " + s + "\n" + "peso: " + this.peso +
				"\n" + "altura: " + this.altura;
	}
	
	
}
