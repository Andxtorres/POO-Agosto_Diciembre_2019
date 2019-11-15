import java.io.Serializable;

public class Contacto implements Serializable{
	public String nombre;
	public String correo;
	public String telefono;


	public Contacto(String nombre, String correo,String telefono){
		this.nombre=nombre;
		this.correo=correo;
		this.telefono=telefono;
	}

	public String toString(){
		return nombre+" correo: "+correo+" tel: "+telefono;
	}

}