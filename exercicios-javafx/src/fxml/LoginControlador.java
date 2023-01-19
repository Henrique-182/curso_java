package fxml;

import org.controlsfx.control.Notifications;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginControlador {
	
	@FXML
	private TextField campoEmail;
	@FXML
	private PasswordField campoSenha;

	public void entrar() {
		boolean emailValido = campoEmail.getText().equalsIgnoreCase("aluno@cod3r.com.br");
		boolean senhaValida = campoSenha.getText().equals("12345678");
		
		if (emailValido && senhaValida) {
			Notifications.create().title("Login FXML").text("Login efetuado com sucesso").showInformation();;
		} else {
			Notifications.create().title("Login FXML").text("Ocorreu uma falha no login").showError();
		}
	}
}
