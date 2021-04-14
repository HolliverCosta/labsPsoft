package bigExampleLab;

public class AnuncioImagem extends Anuncio {

	public AnuncioImagem(String descricao) {
		super(descricao);
		precoDoAnuncio = 2;
	}

	@Override
	public double getPrecoAnuncio(int diasAnuncio) {
		double resultadoAnuncio = precoDoAnuncio * diasAnuncio;

		return resultadoAnuncio;
	}

}
