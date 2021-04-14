package model;

import model.Transportes.Carro;
import model.Transportes.Metro;
import model.Transportes.Onibus;
import model.Transportes.Pedestre;

public enum TipoTransporte {
	PEDESTRE{
		@Override
		public Transporte obterTransporte() {
			return new Pedestre();
		}
	},
 	CARRO{

		@Override
		public Transporte obterTransporte() {
			return new Carro();
		}
		
	},
	ONIBUS{

		@Override
		public Transporte obterTransporte() {
			return new Onibus();
		}
		
	},
	METRO{

		@Override
		public Transporte obterTransporte() {
			return new Metro();
		}
		
	};
	
	public abstract Transporte obterTransporte();
}
