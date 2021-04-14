package model;

import java.util.Scanner;

public class Rota {
	public static void main(String[] args) {
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.print("Qual o tipo de transporte (1) Pedestre, (2) Carro, (3) Onibus, (4) Metro: ");
			int input = entrada.nextInt();			
			TipoTransporte tipoTransporte = TipoTransporte.values()[input -1];
			Transporte transporte = tipoTransporte.obterTransporte();
			
			String retorno = transporte.toString();
			System.out.printf("Calculando a rota de " + retorno + " ..." );
		}
	}
}
