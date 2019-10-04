public class Main{
	public static void main(String args[]){

		Figura[] figuras= new Figura[2];
		Circulo c= new Circulo();
		c.radio=5;
		Cuadrado c1= new Cuadrado();
		c1.lado=10;

		figuras[0]=c;
		figuras[1]=c1;

		for(int i=0;i<figuras.length;i++){
			System.out.println("El perimetro de la figura "+figuras[i].getNombre()+" es: "+
				figuras[i].calcularPerimetro());
		}

	}
}