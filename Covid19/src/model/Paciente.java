package model;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import situacao.NaoHabilitado;

public class Paciente {
	private String nome,endereco,email,profissao,cpf;
	private int numeroSus,telefone;
	private int idade;
	private Situacao situacao;
	private ArrayList<String> comorbidades;
	private Date dataPrimeiraDose;
	
	public Paciente(String nome,String cpf, String endereco,int numeroSus,String email,int telefone,String profissao,ArrayList<String> comorbidades,int idade) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.numeroSus = numeroSus;
		this.email = email;
		this.telefone = telefone;
		this.profissao = profissao;
		this.comorbidades = comorbidades;
		this.idade = idade;
		this.situacao = new NaoHabilitado();
		this.dataPrimeiraDose = null;
	}
	
	public String getDataPrimeiraDose() {
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		return formatador.format(dataPrimeiraDose);
	}
	public void tomouPrimeiraDose() {
		this.dataPrimeiraDose = new Date();
		
	}

	public Situacao getSituacao() {
		return situacao;
	}

	public void setSituacao(Situacao situacao) {
		this.situacao = situacao;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public ArrayList<String> getComorbidades() {
		return comorbidades;
	}
	
	public void setComorbidades(ArrayList<String> comorbidades) {
		this.comorbidades = comorbidades;
	}

	public String getCpf() {
		return cpf;
	}

	@Override
	public String toString() {
		return "Paciente [nome=" + nome + ", endereco=" + endereco + ", email=" + email + ", profissao=" + profissao
				+ ", comorbidades=" + comorbidades + ", cpf=" + cpf + ", numeroSus=" + numeroSus + ", telefone="
				+ telefone + ", idade=" + idade + ", situacao=" + situacao + "]";
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getNumeroSus() {
		return numeroSus;
	}
}
