public class Main{
	public static void main(String args[]){

		Profesor[] profesores= new Profesor[3];
		ProfesorMalo p1= new ProfesorMalo("Andres","POO",16);
		ProfesorBueno p2= new ProfesorBueno("David","Moviles",95);
		Profesor p3= new Profesor("Juan","Mate");
		profesores[0]=p1;
		profesores[1]=p2;
		profesores[2]=p3;
		for(int i=0;i<profesores.length;i++){
			Profesor p= profesores[i];
			p.enseniar();
		}
	}
}