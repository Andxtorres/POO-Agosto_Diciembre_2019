import javax.swing.JOptionPane;


public class Main{
	public static void main(String args[]){
		String cantidadStr= JOptionPane.showInputDialog("¿Cuánto dinero quieres cambiar?");		
		String cambioAMonedaStr= JOptionPane.showInputDialog("De qué a qué quieres cambiar?\n 1) Peso a Dolar \n 2) Dolar a Peso\n 3) Peso a Euro\n 4) Euro a peso\n 5)Dolar a Euro\n 6) Euro a Peso\n 7) Yen a Peso\n 8) Peso a Yen");
		int seleccion= Integer.parseInt(cambioAMonedaStr);
		double resultado=0.0;
		double cantidad= Double.parseDouble(cantidadStr);
		switch(seleccion){
			case 1:
				resultado=ConvertidorMoneda.pesoADolar(cantidad);
				break;
		}
		JOptionPane.showMessageDialog(null,"El resultado es: $"+resultado);
	}
}