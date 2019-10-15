package ui;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.Group;
import personaje.*;
import personaje.heroe.*;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import mapa.*;
import javafx.stage.*;
public class MainScene extends Scene{
	private Mapa m;
	public MainScene(Group gp,Heroe h){
		super(gp);
		m= new Mapa();
		System.out.println("Imprime");
		System.out.println(m.casillas[0][0]);
		m.casillas[0][0].h=h;

		GridPane gridPane = new GridPane();
		for(int i=0;i<m.casillas.length-1;i++){
			for(int j=0;j<m.casillas[i].length-1;j++){
				if(m.casillas[i][j].h==null){
					gridPane.add(new Label("Vacío"),i,j);
				}else{
					gridPane.add(new Label(h.nombre),i,j);

				}

			}
		}
		gp.getChildren().add(gridPane);
	}
	
}