package Login;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

public class LoginController implements Initializable {


	LoginModel loginModel = new LoginModel();
	
	@FXML
	private Label dbstatus;
	@FXML 
	private TextField username;
	@FXML
	private PasswordField password;
	@FXML
	private ComboBox<option> comboBox;
	@FXML
	private Button loginButton;
	
	
	
	

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		if(this.loginModel.isDatabaseConnected()) {
			this.dbstatus.setText("Connected to Database");
		
		}else {
			this.dbstatus.setText("Not Connected to Database");
		}
		this.comboBox.setItems(FXCollections.observableArrayList(option.values()));
	}
	
@FXML
public void Login(ActionEvent event) {
	
}
public void studentLogin() {
	
}
public void adminLogin() {
	
}
}
