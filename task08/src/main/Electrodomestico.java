package main;

public class Electrodomestico {
	protected double precioBase;
	protected Color color;
	protected ConsumoE consumoE;
	protected double peso;
	
	public Electrodomestico() {
		this.precioBase = 100.00;
		this.color = Color.BLANCO;
		this.consumoE = ConsumoE.F;
		this.peso = 5.00;
	}
	
	public Electrodomestico(double precioBase, double peso) {
		super();
		this.precioBase = precioBase;
		this.color = Color.BLANCO;
		this.consumoE = ConsumoE.F;
		this.peso = peso;
	}

	public Electrodomestico(double precioBase, String color, String consumoE, double peso) {
		super();
		this.precioBase = precioBase;
		this.color = Color.carga(color);
		this.consumoE = ConsumoE.carga(consumoE);
		this.peso = peso;
	}

	enum ConsumoE {
		A, B, C, D, F;

		private static ConsumoE carga(String s) {
			ConsumoE aux = Enum.valueOf(ConsumoE.class, s.toUpperCase());
			return aux;
		}
	}

	enum Color {
		BLANCO, NEGRO, ROJO, AZUL, GRIS;

		private static Color carga(String s) {
			Color aux = Enum.valueOf(Color.class, s.toUpperCase());
			return aux;
		}
	}

	@Override
	public String toString() {
		return "\nprecioBase: " + precioBase + "\ncolor: " + color +
				"\nconsumoE: " + consumoE + "\npeso="
				+ peso ;
	}
	
}
