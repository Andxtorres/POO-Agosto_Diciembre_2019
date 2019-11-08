public class Main{
	public static void main(String args[]){
		/*
		//Haciendo uso de bloque try catch para manejo de excepciones no comprobadas

		System.out.println("Linea 4 de codigo");
		int x=0;
		try{
			x= Integer.parseInt("a");
			System.out.println("Linea 7 de codigo");
		}catch(NumberFormatException e){
			System.out.println("Ocurrio un NumberFormatException");
		}
		
		System.out.println("Linea 12 de codigo "+(x+""));
		*/
		try{
			Producto p= new Producto(25000,"iPhone 11 Pro");
			System.out.println("Producto: "+p.getNombre()+" $"+p.getPrecio());

		}catch(PrecioNegativoException e){
			System.out.println(e.getMessage());
		}

	}
}