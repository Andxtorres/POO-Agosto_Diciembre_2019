public class Usuario{
	private String nombreUsuario;
	private Producto[] carrito;

	public Usuario(String nombreUsuario){
		this.nombreUsuario=nombreUsuario;
		carrito= new Producto[10];
	}

	public String getNombreUsuario(){
		return nombreUsuario;
	}

	public void addProducto(Producto p,int index){
		carrito[index]=p;
	}

	public Producto[] getCarrito(){
		return carrito;
	}

	//Aqui debería haber getters y setters
}