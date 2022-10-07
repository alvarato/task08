package main;

import java.util.concurrent.ThreadLocalRandom;

public class Password {
	private String password;
	private int longitud;

	private final String caracters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";

	public Password() {
		this.longitud = 8;
		this.password = autoPassword(longitud);
	}

	public Password(int longitud) {
		this.password = autoPassword(longitud);
		this.longitud = password.length();
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
		this.longitud = password.length();
	}

	public String autoPassword(int longitud) {
		String aux = "";
		for (int i = 0; i < longitud; i++) {
			int nAleatorio = ThreadLocalRandom.current().nextInt(0, this.caracters.length() - 1);
			char cAleatorio = this.caracters.charAt(nAleatorio);
			aux += cAleatorio;
		}
		return aux;
	}

	@Override
	public String toString() {
		return "\npassword: " + password + "\n longitud: " + longitud ;
	}

}
