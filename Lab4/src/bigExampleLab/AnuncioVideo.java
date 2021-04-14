package bigExampleLab;

public class AnuncioVideo extends Anuncio {

	public AnuncioVideo(String descricao) {
		super(descricao);
		precoDoAnuncio = 3;
	}

	@Override
	public double getPrecoAnuncio(int diasAnuncio) {
		double resultadoAnuncio = precoDoAnuncio * diasAnuncio;

		return resultadoAnuncio;
	}

	@Override
	public int temMaisPontos(int diasAnuncio) {

		if (diasAnuncio > 1) {

			return 1;
		}

		return 0;
	}

}
