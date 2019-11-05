import javafx.application.Application;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.scene.input.*;
import javafx.stage.*;
import javafx.scene.*;

public class Main extends Application{
	private Envio envio;
	private TextField anchoTxt,largoTxt,altoTxt,distanciaTxt,tipoTxt;

	public static void main(String args[]){
		launch(args);
	}

	public void start(Stage primaryStage){
		primaryStage.setTitle("Examen");
		Group gp= new Group();
		Scene sc= new Scene(gp);
		primaryStage.setScene(sc);
		VBox vbox= new VBox();
		vbox.getChildren().add(new Label("Ancho:"));
		anchoTxt=new TextField();
		vbox.getChildren().add(anchoTxt);
		vbox.getChildren().add(new Label("Largo:"));
		largoTxt=new TextField();
		vbox.getChildren().add(largoTxt);
		vbox.getChildren().add(new Label("Alto:"));
		altoTxt=new TextField();
		vbox.getChildren().add(altoTxt);
		vbox.getChildren().add(new Label("Distancia:"));
		distanciaTxt=new TextField();
		vbox.getChildren().add(distanciaTxt);
		vbox.getChildren().add(new Label("Tipo: U (Urgente) N (Normal) P (Prioritario)"));
		tipoTxt=new TextField();
		vbox.getChildren().add(tipoTxt);		
		gp.getChildren().add(vbox);
		Button button= new Button("Calcular");
		vbox.getChildren().add(button);
		button.addEventHandler(MouseEvent.MOUSE_CLICKED,new BotonHandler());
		primaryStage.show();

	}

	public class BotonHandler implements EventHandler<MouseEvent>{
		public void handle(MouseEvent e){
			switch(tipoTxt.getText()){
				case "U":
					envio= new EnvioUrgente(Integer.parseInt(anchoTxt.getText()),Integer.parseInt(largoTxt.getText()),Integer.parseInt(altoTxt.getText()),Integer.parseInt(distanciaTxt.getText()));
					break;
				case "N":
					envio= new EnvioNormal(Integer.parseInt(anchoTxt.getText()),Integer.parseInt(largoTxt.getText()),Integer.parseInt(altoTxt.getText()),Integer.parseInt(distanciaTxt.getText()));
					break;
				case "P":
					envio= new EnvioPrioritario(Integer.parseInt(anchoTxt.getText()),Integer.parseInt(largoTxt.getText()),Integer.parseInt(altoTxt.getText()),Integer.parseInt(distanciaTxt.getText()));
					break;										
			}
			System.out.println("Envio: "+envio.calcularPrecio());
		}
	}
}