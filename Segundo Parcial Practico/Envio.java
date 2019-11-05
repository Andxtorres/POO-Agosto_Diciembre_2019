public abstract class Envio{
	private int ancho,largo,alto,distancia;
	public double precioBase;
	public Envio(int ancho,int largo,int alto,int distancia){
		this.ancho=ancho;
		this.largo=largo;
		this.alto=alto;
		this.distancia=distancia;
		precioBase=200.0;
	}

	public abstract double calcularPrecio();
	public abstract double calcularPrecio(double descuento);

	public int getAncho(){
		return ancho;
	}
	public int getLargo(){
		return largo;
	}
	public int getAlto(){
		return alto;
	}
	public int getDistancia(){
		return distancia;
	}
	public void setAncho(int ancho){
		this.ancho=ancho;
	}
	public void setLargo(int largo){
		this.largo=largo;
	}
	public void setAlto(int alto){
		this.alto=alto;
	}
	public void setDistancia(int distancia){
		this.distancia=distancia;
	}

}