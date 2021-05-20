package model;

import java.util.ArrayList;
import java.util.HashSet;

public class Permissoes {
	private HashSet<String> profissoes;
	private HashSet<String> comorbidades;
	private int idade;

	public Permissoes() {
		this.profissoes = new HashSet<>();
		this.comorbidades = new HashSet<>();
		this.idade = 60;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public HashSet<String> getProfissoes() {
		return profissoes;
	}

	public HashSet<String> getComorbidades() {
		return comorbidades;
	}

	public boolean verificaProfissao(String profissao) {
		return profissoes.contains(profissao);
	}

	public boolean verificaComorbidade(ArrayList<String> comorbidade) {
		boolean retorno = false;
		for (String c : comorbidade) {
			if (this.comorbidades.contains(c)) {
				retorno = true;
			}
		}
		return retorno;
	}

}
