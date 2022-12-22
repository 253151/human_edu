package fx05;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;

public class RootController018 implements Initializable {
	@FXML private AnchorPane root;
	@FXML private Circle circle;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		circle.centerXProperty().bind(Bindings.divide(root.widthProperty(), 2));
		// circle.centerXProperty() : 원의 x위치
		circle.centerYProperty().bind(Bindings.divide(root.heightProperty(), 2));	
		// circle.centerYProperty() : 원의 y위치
		
	}
}
