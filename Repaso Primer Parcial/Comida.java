public class Comida extends Producto{
	private String caducidad;
	public Comida(String caducidad,String nombre, double precio){
		super(precio,nombre);
		this.caducidad=caducidad;
	}
}