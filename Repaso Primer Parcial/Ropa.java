public class Ropa extends Producto{
	private String talla;
	public Ropa(String talla,double precio, String nombre){
		super(precio,nombre);
		this.talla=talla;
	}
}