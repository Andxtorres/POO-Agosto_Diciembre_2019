public class Main{
	public static void main(String args[]){
		Perro perro= new Perro();
		perro.raza="Bulldog";
		perro.clase="Extraterrestre";
		System.out.println("Los perros son: "+Perro.clase);
		
		Perro perro2=new Perro();

		perro2.raza="Husky";
		perro2.clase="Mamífero";
		System.out.println("El perro es de raza: "+perro.raza+" y clase: "+perro.clase);
		System.out.println("El perro 2 es de raza: "+perro2.raza+" y clase: "+perro2.clase);
		System.out.println("Los perros son: "+Perro.clase);
	}
}