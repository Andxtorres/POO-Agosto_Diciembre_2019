/*
	Realizar un programa que le pregunte al
	usuario su correo y contraseña, lo guarde
	y después pregunte el usuario y la 
	contraseña para hacer login

*/
import java.util.Scanner;


public class Main{
	public static void main(String args[]){
		System.out.println("Dame el correo: ");
		Scanner sc= new Scanner(System.in);
		String correoStr= sc.nextLine();
		System.out.println("Dame la contrasenia: ");
		String contraseniaStr= sc.nextLine();
		Usuario u= new Usuario();
		u.setCorreo(correoStr);
		u.setContrasenia(contraseniaStr);
		System.out.println("El correo es: "+u.getCorreo());
		System.out.println("La contrasenia es: "+u.getContrasenia());
		System.out.println("Haz login: ");
		System.out.println("Dame el correo: ");
		String correoLoginStr= sc.nextLine();
		System.out.println("Dame la contrasenia: ");
		String contraseniaLoginStr= sc.nextLine();
		boolean logged= u.login(correoLoginStr,contraseniaLoginStr);
		if(logged)
			System.out.println("Loggeado!!");
		else
			System.out.println("Usuario incorrecto");


	}
}