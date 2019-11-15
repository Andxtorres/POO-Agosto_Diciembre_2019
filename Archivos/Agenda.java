import java.io.Serializable;


public class Agenda implements Serializable{
	public Contacto[] contactos;
	public Agenda(){
		contactos= new Contacto[50];
	}

	public void addContacto(Contacto contacto, int index){
		contactos[index]=contacto;
	}

	public String imprimeAgenda(){
		String resultado="";
		for(int i=0;i<contactos.length;i++){
			if(contactos[i]!=null){
				resultado=resultado+(i+1)+".- "+contactos[i].toString()+" \n";
			}else{
				resultado=resultado+(i+1)+".- Vacio \n";
			}
		}
		return resultado;
	}
}