
package mapa;
public class Mapa{

	public Casilla[][] casillas;


	public Mapa(){
		casillas=new Casilla[50][50];
		
		for(int i=0;i<casillas.length;i++){
			for(int j=0;j<casillas[i].length;j++){
				casillas[i][j]=new Casilla();
			}
		}
	}
}