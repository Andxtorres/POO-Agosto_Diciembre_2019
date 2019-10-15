import personaje.heroe.*;
import personaje.villano.*;
import personaje.*;
import javafx.application.Application;
import javafx.stage.*;
import ui.*;
import javafx.scene.Group;
public class Main extends Application{
	public Heroe h;	
	public static void main(String args[]){
		Application.launch(args);
	}

	public void start(Stage primaryStage){
		primaryStage.setTitle("Mini Proyecto");
		primaryStage.setWidth(800);
		primaryStage.setHeight(800);
		primaryStage.show();
		Group gp= new Group();
		primaryStage.setScene(new SeleccionDePersonajeScene(gp,h,primaryStage));
	}
}