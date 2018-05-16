package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;


import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MainController  implements Initializable{
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	}
	@FXML
	private TextField txtNome;
	@FXML
	private TextField txtSobrenome;
	@FXML
	private TextField txtSexo;
	@FXML
	private TextField txtIdade;
	
	public void Cadastro(ActionEvent event)throws IOException{
		
		if(txtNome.getText().equals("Rafael") && txtSobrenome.getText().equals("Oliveira") && txtSexo.getText().equals("Masculino") && txtIdade.getText().equals("24")) {
			//"CADASTRO REALIZADO COM SUCESSO"
			Stage primaryStage = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("/application/SUCESSO.fxml"));
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.show();
			
		}else {
			//"CADASTRO NÃO REALIZADO"
			Stage primaryStage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("/application/NAOREALIZADO.fxml"));
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.show();
			
			//Teste no git
			
		}
	}

}
