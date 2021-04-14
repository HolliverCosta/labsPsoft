package bigExampleLab;
/*
 * Compra agora guarda o preco total do anuncio, adicionei tambem um toString
 */
public class Compra {

	private Anuncio anuncio;
	private int diasAnuncio;
	private double total;

	public Compra(Anuncio anuncio, int diasAnuncio) {

		this.anuncio = anuncio;
		this.diasAnuncio = diasAnuncio;
		this.total = anuncio.getPrecoAnuncio(this.diasAnuncio);
	}

	public int getDiasAnuncio() {

		return diasAnuncio;
	}

	public double getValorTotal() {

		return total;
	}

	public Anuncio getAnuncio() {

		return anuncio;
	}

	public String getDescricaoAnuncio() {

		return anuncio.getDescricao();
	}

	public int temMaisPontos() {

		return anuncio.temMaisPontos(diasAnuncio);
	}

	@Override
	public String toString() {

		return "\t" + anuncio.getDescricao() + "\t" + String.valueOf(total) + "\n";

	}
}