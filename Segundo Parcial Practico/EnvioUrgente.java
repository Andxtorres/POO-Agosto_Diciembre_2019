public class EnvioUrgente extends Envio{
	public EnvioUrgente(int ancho,int largo,int alto,int distancia){
		super(ancho,largo,alto,distancia);
	}
	public double calcularPrecio(){
		return (precioBase*getAncho()*getAlto()*getLargo())/(getDistancia()/10);
	}
	public double calcularPrecio(double descuento){
		return ((precioBase*getAncho()*getAlto()*getLargo())/(getDistancia()/10))*(1-descuento);

	}
}