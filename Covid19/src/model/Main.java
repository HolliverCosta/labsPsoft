package model;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		 SUSController sus = new SUSController();
		 
		// criando a permissoes para se habilitar para a primeira dose 
		sus.habilitarRequisitos("profissao", "medico");
		sus.habilitarRequisitos("idade", "50");
		sus.habilitarRequisitos("comorbidade", "obeso");
		sus.habilitarRequisitos("comorbidade", "asmatico");
		 // cadastrando os pacientes
		sus.cadastrarpaciente("Holliver", "123456789123", "avenida", 001, "@gmail.com", 88905463, "medico", new ArrayList<String>(Collections.singleton("nenhuma")),21);
		
		sus.cadastrarpaciente("Rebeca", "123456789124", "avenida", 002, "@gmail.com", 88905462, "Advogada", new ArrayList<String>(Collections.singleton("nenhuma")), 60);
		
		sus.cadastrarpaciente("Joao", "123456789125", "avenida", 003, "@gmail.com", 88905464, "pedreiro", new ArrayList<String>(Collections.singleton("obeso")),40);
		
		sus.cadastrarpaciente("jose", "123456789126", "avenida", 004, "@gmail.com", 88905465, "nada", new ArrayList<String>(Collections.singleton("asmatico")),40);
		
		//no cadastro ja verifica se os pacientes sao habilitados ou nao para tomar a vacina
		System.out.println(sus.getPaciente(001).getSituacao().toString());
		System.out.println(sus.getPaciente(002).getSituacao().toString());
		System.out.println(sus.getPaciente(003).getSituacao().toString());
		System.out.println(sus.getPaciente(004).getSituacao().toString());
		//tomando a primeira dose
		sus.tomar1dose();
		System.out.println(sus.getPaciente(001).getSituacao().toString());
		System.out.println(sus.getPaciente(002).getSituacao().toString());
		System.out.println(sus.getPaciente(003).getSituacao().toString());
		System.out.println(sus.getPaciente(004).getSituacao().toString());
		//habilitando para a segunda dose
		sus.habilitar2dose("30/05/2021");
		System.out.println(sus.getPaciente(001).getSituacao().toString());
		System.out.println(sus.getPaciente(002).getSituacao().toString());
		System.out.println(sus.getPaciente(003).getSituacao().toString());
		System.out.println(sus.getPaciente(004).getSituacao().toString());
		//tomando a segunda dose
		sus.tomar2dose();
		System.out.println(sus.getPaciente(001).getSituacao().toString());
		System.out.println(sus.getPaciente(002).getSituacao().toString());
		System.out.println(sus.getPaciente(003).getSituacao().toString());
		System.out.println(sus.getPaciente(004).getSituacao().toString());
		//finalizando
		sus.finalizarVacina();
		System.out.println(sus.getPaciente(001).getSituacao().toString());
		System.out.println(sus.getPaciente(002).getSituacao().toString());
		System.out.println(sus.getPaciente(003).getSituacao().toString());
		System.out.println(sus.getPaciente(004).getSituacao().toString());
		

	}
}
