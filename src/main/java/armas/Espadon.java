package armas;

import personas.Soldado;

public class Espadon extends Arma{
	private Integer peso;
	
	public Espadon(Integer peso) {
		this.peso = peso;
	}
	
	@Override
	public Integer potencia(Soldado soldado) {
		return soldado.getEdad() < 40 ? peso / 2 : 6;
	}

}
