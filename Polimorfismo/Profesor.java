public class Profesor{
	private String nombre;
	private String materia;

	public Profesor(){
		nombre="Sin nombre";
		materia="Sin materia";
	}
	public Profesor(String nombre,String materia){
		this.nombre=nombre;
		this.materia=materia;
	}

	public void setNombre(String nombre){
		this.nombre=nombre;
	}

	public String getNombre(){
		return nombre;
	}

	public void setMateria(String materia){
		this.materia=materia;
	}

	public String getMateria(){
		return materia;
	}

	public void enseniar(){
		System.out.println("El profesor: "+
			nombre+" esta enseniando: "+materia);
	}

}