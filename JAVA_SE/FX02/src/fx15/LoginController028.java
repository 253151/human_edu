package fx15;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;

public class LoginController028 implements Initializable {
	@FXML private BorderPane login;
	@FXML private Button btnMain;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		btnMain.setOnAction(e->handleBtnMain(e));
	}
	
	public void handleBtnMain(ActionEvent event) {
		try {
			StackPane root = (StackPane) btnMain.getScene().getRoot();
			
			login.setTranslateX(0);
			// 이동의 애니메이션의 시작점을 가로 0px 시점에서 시작함
			// 350px는 화면의 가로 크기를 의미함
			
			Timeline timeline = new Timeline();
			KeyValue keyValue = new KeyValue(login.translateXProperty(), 350);	
			// 이동하는 X좌표를 350까지 이동함
			KeyFrame keyFrame = new KeyFrame(
	    		Duration.millis(100), 
	    		// 1초동안 애니메이션 작동
	    		new EventHandler<ActionEvent>() {
		        	@Override
		        	public void handle(ActionEvent event) {
		        		root.getChildren().remove(login);
		        	}
		        }, 
		        keyValue
		        // 2번째 인자 new EventHandler는 애니메이셔니 종료되었을 때 동작하는 것을 의미함.
		        // root.getChildren().remove(login);는 main 페이지에서 login페이지를 지우는 것을 의미함
	        );
			timeline.getKeyFrames().add(keyFrame);
			timeline.play();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
