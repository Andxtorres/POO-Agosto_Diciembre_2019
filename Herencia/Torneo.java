public class Torneo{
	private String nombre;
	private double premio;
	private Tenista[] tenistas= new Tenista[5];

	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	public String getNombre(){
		return nombre;
	}
	public void setPremio(double premio){
		this.premio=premio;
	}

	public double getPremio(){
		return premio;
	}

	public Tenista[] getTenistas(){
		return tenistas;
	}

	public void addTenista(Tenista tenista,int index){
		tenistas[index]=tenista;
	}

	public void imprimeTenistas(){
		for(int i=0;i<tenistas.length;i++){
			if(tenistas[i]!=null){
				System.out.println("Tenista: "+tenistas[i].getNombre());

			}else{
				System.out.println("Puesto vacante");
			}
		}
	}
}