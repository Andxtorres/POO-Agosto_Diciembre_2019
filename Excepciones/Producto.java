public class Producto{
	private double precio;
	private String nombre;

	public Producto(double precio, String nombre) throws PrecioNegativoException{
		if(precio<0){
			throw new PrecioNegativoException();
		}
		this.precio=precio;
		this.nombre=nombre;
	}

	public void setPrecio(double precio){
		this.precio=precio;
	}
	public double getPrecio(){
		return precio;
	}

	public void setNombre(String nombre){
		this.nombre=nombre;
	}

	public String getNombre(){
		return nombre;
	}
}