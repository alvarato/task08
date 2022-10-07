package main;

import javax.swing.JOptionPane;

public class mainApp {
	public static void main(String[] args) {
		Persona persona = new Persona();
		Password password = new Password();
		Electrodomestico electrodomestico = new Electrodomestico();
		Serie serie = new Serie();
		boolean flag;
		do {
			
			int n1 = Integer
					.parseInt(JOptionPane.showInputDialog("Ingrese el número para realizar la función que desee \n"
							+ "(1) Persona \n" + "(2) Password \n" + "(3) Electrodomestico \n"
							+ "(4) Serie"));
			switch (n1) {
			case 1:
				JOptionPane.showMessageDialog(null, "Persona");
				JOptionPane.showMessageDialog(null, "Por defecto: " +  persona.toString());
				persona = new Persona("Alvaro",24,true);
				JOptionPane.showMessageDialog(null, "Ingresando Nombre, Edad, Sexo: " + persona.toString());
				persona = new Persona("Alvaro",24,"43597789R",true,84.500,1.76);
				JOptionPane.showMessageDialog(null, "Ingresando Todos los Parametros: " + persona.toString());
				break;
			case 2:
				String aux = password.toString();
				JOptionPane.showMessageDialog(null, "Password");
				JOptionPane.showMessageDialog(null, "Por defecto: " + password.toString());
				password = new Password(10);
				JOptionPane.showMessageDialog(null, "Ingresando la cantidad de caracteres (10): " + password.toString());
				JOptionPane.showMessageDialog(null, "Por defecto: (08)| " + aux + "\n" +
													"Ingresando la cantidad de caracteres: (10)| " + password.toString());
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "Electrodomestico");
				JOptionPane.showMessageDialog(null, "Por defecto: " + electrodomestico.toString());
				electrodomestico = new Electrodomestico(599.99,20.3);
				JOptionPane.showMessageDialog(null, "Introduciendo precio y peso" + electrodomestico.toString());
				electrodomestico = new Electrodomestico(650.49,"rojo","b",0.900);
				JOptionPane.showMessageDialog(null, "Introduciendo todos los parametros: " + electrodomestico.toString());
				break;
			case 4:
				JOptionPane.showMessageDialog(null, "Serie");
				JOptionPane.showMessageDialog(null, "Por defecto: " + serie.toString());
				serie = new Serie("Iron Man", "MARVEL");
				JOptionPane.showMessageDialog(null, "Introduciendo titulo y creador" + serie.toString());
				serie = new Serie("THOR",5,"ACCION","COMEDIA","MARVEL");
				JOptionPane.showMessageDialog(null, "Introduciendo todos los atributos excepto entregado" + serie.toString());
				break;
			default:
				JOptionPane.showMessageDialog(null, "Error al ingresar una función");
				break;
			}
			int auxFlag = Integer
					.parseInt(JOptionPane.showInputDialog("Ingrese 1 para selecionar otra opcion, 2 para salir"));
			flag = (auxFlag == 1) ? true : false;
		} while (flag);
	}
}
