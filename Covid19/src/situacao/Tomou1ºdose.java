package situacao;

import model.Paciente;
import model.Situacao;

public class Tomou1ºdose extends Situacao{
	public void habilitar(Paciente paciente) {
		paciente.setSituacao(new Habilitado2ºdose());
	}
	public String toString() {
		return "Você ja tomou a primeira dose";
	}
}
