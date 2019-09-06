public class ProfesorMalo extends Profesor{
	private int comentarios;
	public ProfesorMalo(String nombre,String materia, int comentarios){
		super(nombre,materia);
		this.comentarios=comentarios;
	}
	public void setComentarios(int comentarios){
		this.comentarios=comentarios;
	}

	public int getComentarios(){
		return comentarios;
	}
	public void enseniar(){
		System.out.println("El profesor malo: "+
			getNombre()+" esta enseniando: "+getMateria()+" con un numero de comentarios de: "+comentarios);
	}		
}