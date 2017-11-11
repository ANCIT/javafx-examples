package ancit.javafx.examples.vbox;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VBoxMain extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		VBox root = new VBox();

		root.setSpacing(10);
		root.setPadding(new Insets(10, 5, 10, 5));

		Button btn1 = new Button("Button 1");
		root.getChildren().add(btn1);

		Button btn2 = new Button("Button 2");
		btn2.setPrefSize(100, 100);
		root.getChildren().add(btn2);

		TextField txtField = new TextField();
		txtField.setPrefWidth(10);
		root.getChildren().add(txtField);

		primaryStage.setTitle("VBox Demo Application");
		primaryStage.setScene(new Scene(root));
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
