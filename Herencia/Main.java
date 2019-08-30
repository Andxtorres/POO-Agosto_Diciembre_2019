import java.util.Scanner;
public class Main{
	public static void main(String args[]){
		GrandSlam gs= new GrandSlam();
		gs.setNombre("Wimbledon");
		gs.setPremio(500000);
		gs.setPuntosQueOtorga(100);
		System.out.println("El torneo: "+gs.getNombre()+" reparte: $"+gs.getPremio()+" y otorga: "+gs.getPuntosQueOtorga()+" puntos de la ATP");
		Amistoso amistoso= new Amistoso();
		amistoso.setNombre("Amistoso en el Tec");
		amistoso.setPremio(500000);
		amistoso.setDonacion(100);
		int seleccion=0;
		do{
			System.out.println("Elige una opcion 1) Agregar un tenista 2)Imprimir lista de torneo 3)Salir");
			Scanner sc= new Scanner(System.in);
			seleccion=sc.nextInt();
			sc.nextLine();
			switch(seleccion){
				case 1:
					System.out.println("Cuál es el nombre del tenista?");
					String nombreTenista= sc.nextLine();
					Tenista t= new Tenista();
					t.setNombre(nombreTenista);
					System.out.println("A qué torneo quieres enviarlo? 1) Grand Slam 2)Amistoso");
					int torneoElegido= sc.nextInt();
					sc.nextLine();
					System.out.println("En que pos?");
					int pos= sc.nextInt();
					switch(torneoElegido){
						case 1:
							gs.addTenista(t,pos);
						break;
						case 2:
							amistoso.addTenista(t,pos);
						break;
					}
				break;
				case 2:
					System.out.println("Que torneo quieres imprimir? 1)Grand Slam 2)Amistoso");
					int torneoAImprimir=sc.nextInt();
					switch(torneoAImprimir){
						case 1:
							gs.imprimeTenistas();
						break;
						case 2:
							amistoso.imprimeTenistas();
						break;
					}
			}
		}while(seleccion!=3);
	}
}