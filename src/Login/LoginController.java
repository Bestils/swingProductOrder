package Login;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import produkty.ProduktsController;

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
	try {
		Stage userStage = new Stage();
		FXMLLoader loader = new FXMLLoader();
		Pane root = (Pane)loader.load(getClass().getResource("/produkty/ProduktFXML.fxml").openStream());
		
		ProduktsController produktController = (ProduktsController)loader.getController();
		
		Scene scene 
	}
	catch (IOException ex) {
		ex.printStackTrace();
	}
	
}
public void adminLogin() {
	
}
}
