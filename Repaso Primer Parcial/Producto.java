public class Producto{
	private double precio;
	private String nombre;

	public Producto(double precio,String nombre){
		this.precio=precio;
		this.nombre=nombre;
	}

	public double getPrecio(){
		return precio;
	}

	public String getNombre(){
		return nombre;
	}
	//Debería haber getters y setters

}