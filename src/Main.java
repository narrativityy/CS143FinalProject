import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.TilePane;

public class Main  extends Application {
	
	//Contact List
	ContactManager contacts = new ContactManager();
	
	//Home holds the home page with three buttons
	TilePane home = new TilePane();
	
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			
			//Forces the tilePane to a specific size
			home.setPrefRows(3);
			home.setPrefColumns(1);
			home.setMaxSize(150, 250);
			home.setMinSize(150, 250);
			
			//Creates 3 buttons. View, remove, and add Contacts
			Button button = new Button("View Contacts");
			button.setPrefWidth(150);
			
			button.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					// TODO Auto-generated method stub
					
				}
				
			});
			
			home.getChildren().add(button);
			
			button = new Button("Add Contact");
			button.setPrefWidth(150);
			home.getChildren().add(button);
			
			button = new Button("Remove Contact");
			button.setPrefWidth(150);
			home.getChildren().add(button);
			
			root.setCenter(home);


			//Duplicating a phone’s size
			Scene scene = new Scene(root,400,800);
			
			primaryStage.setTitle("Contacts");
			primaryStage.setScene(scene);
			primaryStage.show();	
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void home(BorderPane root) {
		root.getChildren().clear();
		root.getChildren().add(home);
	}
	
	public static void main(String[] args) throws IOException {
		launch(args);
	}
}
