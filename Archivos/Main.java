import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main{

	public static void main(String[] args){

		Agenda agenda = new Agenda();

		//agenda.addContacto(new Contacto("Andres","atorres@applab.mx","5541302205"),5);
		try{
			File selectedFile = new File("agenda.atm");
			FileInputStream fin = new FileInputStream(selectedFile);
			ObjectInputStream ois = new ObjectInputStream(fin);
			agenda= (Agenda) ois.readObject();
		}catch(Exception  e){
			e.printStackTrace();
		}



		Scanner sc= new Scanner(System.in);

		int respuesta=0;
		while(respuesta!=3){
			System.out.println("¿Que quieres hacer? 1) Agregar contacto 2)Imprimir Agenda 3)Salir");
			respuesta=sc.nextInt();
			switch(respuesta){
				case 1:
					System.out.println("Ingresa el nombre del contacto nuevo");
					String nombre= sc.next();
					System.out.println("Ingresa el correo del contacto nuevo");
					String correo= sc.next();
					System.out.println("Ingresa el telefono del contacto nuevo");
					String telefono= sc.next();
					System.out.println("Ingresa el telefono del contacto nuevo");
					int pos= sc.nextInt();
					agenda.addContacto(new Contacto(nombre,correo,telefono),pos);
					try{
						FileOutputStream fout = new FileOutputStream("agenda.atm");
						ObjectOutputStream oos = new ObjectOutputStream(fout);
						oos.writeObject(agenda);
						oos.close();						
					}catch(Exception e){

					}


					break;
				case 2:
					System.out.println(agenda.imprimeAgenda());
					break;
			}
		}
	}

}