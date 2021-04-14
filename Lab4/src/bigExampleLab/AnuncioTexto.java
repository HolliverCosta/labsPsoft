package bigExampleLab;

public class AnuncioTexto extends Anuncio{

	public AnuncioTexto(String descricao) {
		super(descricao);
		precoDoAnuncio = 1.5;
	}
	
	@Override
	public double getPrecoAnuncio(int diasAnuncio) {
		double resultadoAnuncio = precoDoAnuncio;
		
		if(diasAnuncio > 3) {
			resultadoAnuncio += precoDoAnuncio * (diasAnuncio - 3);
		}
		
		return resultadoAnuncio;
	}
	
	

}
