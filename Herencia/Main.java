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
		System.out.println("El torneo: "+amistoso.getNombre()+" reparte: $"+amistoso.getPremio()+" y otorga: $"+amistoso.getDonacion()+" en donacion");
		Tenista t1= new Tenista();
		t1.setNombre("Roger Federer");
		t1.setPatrocinador("Nike");
		gs.addTenista(t1,0);
		gs.imprimeTenistas();
	}
}