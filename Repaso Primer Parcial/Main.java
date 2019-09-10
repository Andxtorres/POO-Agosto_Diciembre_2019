import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("Cual es tu nombre?");
		String nombre= sc.nextLine();
		Usuario u= new Usuario(nombre);
		int respuesta=0;
		do{
			System.out.println("¿Que deseas hacer? 1) Agregar al carrito 2)Imprimir el carrito 3)Terminar");
			respuesta= sc.nextInt();
			switch (respuesta){
				case 1:
					System.out.println("¿Que deseas agregar? 1)Playera 2)Pantalon 3)Leche 4) Huevo ");
					int respuestaProducto=sc.nextInt();
					Producto p=null;
					switch(respuestaProducto){
						case 1:
							p= new Ropa("M",200,"Playera negra");
						break;
						case 2:
							p= new Ropa("34",400,"Pantalon de mezclilla");
						break;
						case 3:
							p= new Comida("Mañana","Leche Lala",10);

						break;
						case 4:
							p= new Comida("1 Mes","Huevo San Juan 1KG",20);
						break;
						default:
							System.out.println("Respuesta incorrecta");
						break;																		
					}
					System.out.println("En que pos de tu carrito quieres agregarlo: ");
					int pos=sc.nextInt();
					u.addProducto(p,pos);
					break;
				case 2:
					double subtotal=0.0;
					for(int i=0;i<u.getCarrito().length;i++){
						if(u.getCarrito()[i]!=null){
							subtotal=subtotal+u.getCarrito()[i].getPrecio();
							System.out.println((i+1)+".- "+u.getCarrito()[i].getNombre()+" $"+u.getCarrito()[i].getPrecio());
						}else{
							System.out.println((i+1)+".- Vacio");

						}
					}
					System.out.println("Subtotal: $"+subtotal);
					System.out.println("IVA: $"+Impuesto.iva(subtotal));
					System.out.println("Total: $"+(subtotal+Impuesto.iva(subtotal)));
					break;
				default:
					System.out.println("Respuesta incorrecta");
					break;


			}

		}while(respuesta!=3);
	}
}