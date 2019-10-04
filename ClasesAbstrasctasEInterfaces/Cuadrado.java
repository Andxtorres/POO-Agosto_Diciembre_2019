public class Cuadrado extends Figura{
	public int lado;

	public Cuadrado(){
		super("Cuadrado");
	}
	public double calcularPerimetro(){
		return 4*lado;
	}

	public double calcularArea(){
		return lado*lado;
	}
}