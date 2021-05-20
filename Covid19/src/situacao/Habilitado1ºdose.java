package situacao;

import model.Paciente;
import model.Situacao;

public class Habilitado1ºdose extends Situacao {
	public void tomar(Paciente paciente) {
		paciente.setSituacao(new Tomou1ºdose());
	}
	public String toString() {
		return "Você está habilitado para tomou a primeira dose";
	}
}
