public class ProfesorBueno extends Profesor{
	private int ecoa;

	public ProfesorBueno(){
		super();
		ecoa=0;
	}
	public ProfesorBueno(String nombre,String materia, int ecoa){
		super(nombre,materia);
		this.ecoa=ecoa;
	}

	public int getEcoa(){
		return ecoa;
	}

	public void setEcoa(int ecoa){
		this.ecoa=ecoa;
	}
	public void enseniar(){
		System.out.println("El profesor bueno: "+
			getNombre()+" esta enseniando: "+getMateria()+" con una ecoa de: "+ecoa);
	}	
}