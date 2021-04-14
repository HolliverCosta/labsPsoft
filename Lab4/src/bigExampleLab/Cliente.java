package bigExampleLab;
/*
 * O cliente nao calcula mais o preco do anuncio 
 * e fiz um metodo para detalhar a compra
 */

import java.util.Enumeration;
import java.util.Vector;

public class Cliente {

	private String nome;
	private Vector compras = new Vector();
	private int pontosFrequentes;
	private double valorTotal;
	

	public Cliente(String nome) {
		this.nome = nome;
	}
	
	public void addCompra(Compra arg) {

		compras.addElement(arg);
		valorTotal += arg.getValorTotal();
		pontosFrequentes++;
		pontosFrequentes += arg.temMaisPontos();
	}

	public String getNome() {
		return nome;
	}

	public String historico() {

		String resultado = "Historico de compras de anuncios por " + getNome() + "\n" + toStringCompra()
				+ "Total devido é " + String.valueOf(valorTotal) + "\n" + "Voce ganhou "
				+ String.valueOf(pontosFrequentes) + " pontos";
		return resultado;
	}

	private String toStringCompra() {

		String resultado = "";

		Enumeration comprasAnuncio = compras.elements();

		while (comprasAnuncio.hasMoreElements()) {

			Compra compra = (Compra) comprasAnuncio.nextElement();
			resultado += compra.toString();
		}

		return resultado;
	}

}