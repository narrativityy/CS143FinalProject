import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;


public class App extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
            StackPane root = new StackPane();
			Scene scene = new Scene(root, 400, 400);

			primaryStage.setTitle("StackPane Example");

            Button btn = new Button();
            btn.setText("Quit");
            btn.setOnAction((ActionEvent event) -> {
                Platform.exit();
            });

            root.getChildren().add(btn);

			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
