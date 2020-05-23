package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller {
	@FXML
	TextField username;
	@FXML
	TextField password;
	@FXML
	Button Clear;
	@FXML
    private void addScene(ActionEvent event)throws IOException{
        Parent view2 = FXMLLoader.load(getClass().getResource("Sample2.fxml"));

        Scene scene2 = new Scene(view2);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();
    }
	
	public void clear() {
		String u = username.getText();
		String p = password.getText();
		username.setText("");
		password.setText("");
		
	}
	
	@FXML
    private void returnScence(ActionEvent event)throws IOException{
        Parent view2 = FXMLLoader.load(getClass().getResource("Sample1.fxml"));

        Scene scene2 = new Scene(view2);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();
    }
	//will open scene in a new window;
	private void newWindowScene(ActionEvent event)throws IOException{
		Parent view = FXMLLoader.load(getClass().getResource("Success.fxml")); //Going to Home page
	    Scene scene = new Scene(view);
	    Stage window = new Stage();
	    window.setScene(scene);
	    window.show();
	}
}