package situacao;

import model.Paciente;
import model.Situacao;

public class NaoHabilitado extends Situacao {
	public void habilitar(Paciente paciente) {
		paciente.setSituacao(new Habilitado1ºdose());
	}
	
	public String toString() {
		return "Você não está habilitado para tomar a primeira dose";
	}
}
