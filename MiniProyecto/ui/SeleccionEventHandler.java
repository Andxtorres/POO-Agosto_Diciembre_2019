package ui;
import javafx.event.Event;
import javafx.event.EventHandler;
import personaje.*;
import personaje.heroe.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.*;
import javafx.stage.*;
import javafx.scene.Group;
import personaje.*;
public class SeleccionEventHandler implements EventHandler<MouseEvent>{
	
	private Heroe h;
	private Label label;
	private String seleccionado;
    private Stage primaryStage;
    private Group gp;

	public SeleccionEventHandler(Heroe h,Label label,String seleccionado,Stage primaryStage, Group gp){
		this.h=h;
		this.label=label;
		this.seleccionado=seleccionado;
        this.gp=gp;
        this.primaryStage=primaryStage;

	}
	public void handle(MouseEvent e){
        
        switch(seleccionado){
        	case "T":
        		h= new Talahasee();
        		break;
        	case "BM":
        		h= new BillMurray();
        		break;
        	case "V":
        		h= new Vaquero();
        		break;
        }
		label.setText(h.nombre);
        primaryStage.setScene(new MainScene(new Group(),h));
    }
}