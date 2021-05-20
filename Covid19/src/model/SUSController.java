package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class SUSController {
	private HashMap<Integer, Paciente> pacientes;
	private Permissoes permissoes;

	public SUSController() {
		this.pacientes = new HashMap<>();
		this.permissoes = new Permissoes();

	}

	public void cadastrarpaciente(String nome, String cpf, String endereco, int numeroSus, String email, int telefone,
			String profissao, ArrayList<String> comorbidades, int idade) {
		Paciente paciente = new Paciente(nome, cpf, endereco, numeroSus, email, telefone, profissao, comorbidades,
				idade);
		habilitar1dose(paciente);
		pacientes.put(numeroSus, paciente);
	}

	public Paciente getPaciente(int numeroSus) {
		return pacientes.get(numeroSus);
	}

	public void alterarDadosPaciente(int numeroSus, String atributo, String novoValor) {
		if (atributo == "nome") {
			pacientes.get(numeroSus).setNome(novoValor);
		} else if (atributo == "email") {
			pacientes.get(numeroSus).setEmail(novoValor);
		} else if (atributo == "telefone") {
			pacientes.get(numeroSus).setTelefone(Integer.parseInt(novoValor));
		} else if (atributo == "profissao") {
			pacientes.get(numeroSus).setProfissao(novoValor);
			habilitar1dose(pacientes.get(numeroSus));
		} else if (atributo == "comorbidades") {
			pacientes.get(numeroSus).getComorbidades().add(novoValor);
			habilitar1dose(pacientes.get(numeroSus));
		}
	}

	public void habilitarRequisitos(String requisito, String novoRequisito) {

		if (requisito == "idade") {
			permissoes.setIdade(Integer.parseInt(novoRequisito));

		} else if (requisito == "profissao") {
			permissoes.getProfissoes().add(novoRequisito);

		} else if (requisito == "comorbidade") {
			permissoes.getComorbidades().add(novoRequisito);

		}

		for (Paciente p : pacientes.values()) {
			habilitar1dose(p);
		}
	}
	
	public void habilitar1dose(Paciente paciente) {
		if (permissoes.verificaProfissao(paciente.getProfissao())
				|| permissoes.verificaComorbidade(paciente.getComorbidades())
				|| paciente.getIdade() >= permissoes.getIdade()) {
			
			paciente.getSituacao().habilitar(paciente);
			
		}
	}

	public void tomar1dose() {
		for (Paciente p : pacientes.values()) {
			if (p.getSituacao().getClass().getSimpleName().equals("Habilitado1ºdose")) {
				p.getSituacao().tomar(p);
				p.tomouPrimeiraDose();
			}
		}
	}

	public void habilitar2dose(String data) {
		for (Paciente p : pacientes.values()) {
			if (p.getSituacao().getClass().getSimpleName().equals("Tomou1ºdose") && calcularQuantidadeDeDiasEntreDatas(p.getDataPrimeiraDose(), data) >= 20) {
				p.getSituacao().habilitar(p);
				
			}
		}
	}

	public void tomar2dose() {
		for (Paciente p : pacientes.values()) {
			if (p.getSituacao().getClass().getSimpleName().equals("Habilitado2ºdose")) {
				p.getSituacao().tomar(p);
			}
		}
	}

	public void finalizarVacina() {
		for (Paciente p : pacientes.values()) {
			if (p.getSituacao().getClass().getSimpleName().equals("Tomou2ºdose")) {
				p.getSituacao().finalizou(p);
			}
		}
	}
	public static long calcularQuantidadeDeDiasEntreDatas(String dataInicio, String dataFim) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        long dias = 0;
        try {
            Date data1 = sdf.parse(dataInicio);
            Date data2 = sdf.parse(dataFim);

            long diferenca = data2.getTime() - data1.getTime();
            dias = TimeUnit.DAYS.convert(diferenca, TimeUnit.MILLISECONDS);
            return dias;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return dias;
    }
}
