import java.lang.Math.*;

public class Circulo extends Figura{
	public int radio;

	public Circulo(){
		super("Circulo");
	}

	@Override
	public double calcularPerimetro(){
		return Math.PI*radio*2;
	}

	@Override
	public double calcularArea(){
		return Math.pow((Math.PI*radio),2);
	}



}