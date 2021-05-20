package situacao;

import model.Paciente;
import model.Situacao;

public class Tomou2ºdose extends Situacao{
	public void finalizou(Paciente paciente) {
		paciente.setSituacao(new Finalizado());
	}
	public String toString() {
		return "Você ja tomou a segunda dose";
	}
}
