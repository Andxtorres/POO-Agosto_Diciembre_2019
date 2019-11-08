public class PrecioNegativoException extends Exception{

	public PrecioNegativoException(){
		super("No puedes tener precios negativos");
	}


}