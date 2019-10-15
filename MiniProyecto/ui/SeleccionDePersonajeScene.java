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
import javafx.stage.*;
import javafx.scene.Group;
public class SeleccionDePersonajeScene extends Scene{

	public SeleccionDePersonajeScene(Group gp,Heroe h,Stage primaryStage){
		super(gp);
		BorderPane border = new BorderPane();
		border.setTop(new Label("Selecciona un personaje"));
		GridPane gridPane=new GridPane();
		border.setCenter(gridPane);
		Label personajeSeleccionadoLabel=new Label("Personaje seleccionado");
		border.setBottom(personajeSeleccionadoLabel);
		Button talahaseeButton= new Button("Talahasee");
		
		talahaseeButton.addEventHandler(MouseEvent.MOUSE_CLICKED,new SeleccionEventHandler(h,personajeSeleccionadoLabel,"T",primaryStage,gp));
		Button vaqueroButton= new Button("Vaquero");
		vaqueroButton.addEventHandler(MouseEvent.MOUSE_CLICKED,new SeleccionEventHandler(h,personajeSeleccionadoLabel,"V",primaryStage,gp));
		Button billMurrayButton= new Button("Bill Murray");
		billMurrayButton.addEventHandler(MouseEvent.MOUSE_CLICKED,new SeleccionEventHandler(h,personajeSeleccionadoLabel,"BM",primaryStage,gp));
		gridPane.add(talahaseeButton,0,0);
		gridPane.setHgrow(talahaseeButton, Priority.ALWAYS);
		gridPane.add(vaqueroButton,1,0);
		gridPane.setHgrow(vaqueroButton, Priority.ALWAYS);
		gridPane.add(billMurrayButton,2,0);
		gridPane.setHgrow(billMurrayButton, Priority.ALWAYS);
		gp.getChildren().add(border);
		
	}
	
}