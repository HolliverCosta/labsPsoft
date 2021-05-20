package situacao;

import model.Paciente;
import model.Situacao;

public class Habilitado2ºdose extends Situacao {
	public void tomar(Paciente paciente) {
		paciente.setSituacao(new Tomou2ºdose());
	}
	public String toString() {
		return "Você está habilitado para tomar a segunda dose";
	}
}
