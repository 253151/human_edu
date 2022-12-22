package fx03;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.binding.Bindings;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;

public class RootController016 implements Initializable {
	@FXML private Slider slider;
	@FXML private Label label;
	@FXML private Circle circle;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		slider.valueProperty().addListener(new ChangeListener<Number>() {
			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				label.setShape(circle);
				circle.centerXProperty().bind(Bindings.divide(label.widthProperty(), 2));
				// circle.centerXProperty() : 원의 x위치
				circle.centerYProperty().bind(Bindings.divide(label.heightProperty(), 2));	
				// circle.centerYProperty() : 원의 y위치
				System.out.println("newValue : " +newValue);
				System.out.println("newValue.douValue() : " +newValue.doubleValue());
				System.out.println("------------------");
			}
		});
	}
}
