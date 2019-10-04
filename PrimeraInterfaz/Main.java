import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import java.io.*;

public class Main extends Application{

	public void start(Stage primaryStage){
		primaryStage.setTitle("Mi ventana");
		Group gp= new Group();
		Scene sc= new Scene(gp);
		HBox hb= new HBox();
		sc.getStylesheets().add("theme.css");
		Button button= new Button("Push me");
		CheckBox ck= new CheckBox("Opcion 1");
		Label label= new Label("Mi label");
		ChoiceBox choiceBox= new ChoiceBox();
		choiceBox.getItems().addAll("Opcion1","Opcion2","Opcion3");
		TextField txtField= new TextField();
		DatePicker dp= new DatePicker();
		txtField.setPromptText("Prompt Text");
		PasswordField pswField= new PasswordField();
		ToggleGroup tg= new ToggleGroup();
		RadioButton r1= new RadioButton("Radio 1");
		r1.setToggleGroup(tg);
		RadioButton r2= new RadioButton("Radio 2");
		r2.setToggleGroup(tg);
		button.setStyle("button");
		primaryStage.setWidth(800);
		primaryStage.setHeight(800);
		gp.getChildren().add(hb);
		hb.getChildren().add(button);
		hb.getChildren().add(ck);
		hb.getChildren().add(label);
		hb.getChildren().add(txtField);
		hb.getChildren().add(r1);
		hb.getChildren().add(r2);
		hb.getChildren().add(pswField);
		hb.getChildren().add(choiceBox);
		hb.getChildren().add(dp);
		primaryStage.setScene(sc);
		primaryStage.show();
	}

	public static void main(String[] args){
		Application.launch(args);
	}
}