package Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;
import javafx.scene.text.TextAlignment;

public class Controller {
	
	
	@FXML
	private Label myLabel;
	
	public void Tapped(ActionEvent event) {
		myLabel.setText("Hello akshay how is your day going");
		myLabel.setTextAlignment(TextAlignment.CENTER);
	}

}
