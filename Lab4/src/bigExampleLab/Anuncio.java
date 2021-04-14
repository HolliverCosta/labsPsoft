package bigExampleLab;
/*
 * Criei uma herença para os anuncios para separar por tipo, 
 * e tambem para calcular o preco do anuncio separadamente, inves
 *  de ser calculado na classe cliente, tambem criei o metodo para calcular o pontos
 */
public class Anuncio {
	
	protected String descricao;
	protected double precoDoAnuncio;
	
	public Anuncio(String descricao) {
		this.descricao = descricao;
		this.precoDoAnuncio = 0;
	}

	public String getDescricao() {
		return descricao;
	}

	public double getPrecoAnuncio(int diasAnuncio) {
		return 0;
	}
	
	public int temMaisPontos(int diasAnuncio) {
		return 0;
	}

}