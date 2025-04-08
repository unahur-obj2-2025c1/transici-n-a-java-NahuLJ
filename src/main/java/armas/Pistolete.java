package armas;

import personas.Soldado;

public class Pistolete extends Arma{
	private Integer largo;
	
	public Pistolete(Integer largo) {
		this.largo = largo;
	}
	
	@Override
	public Integer potencia(Soldado soldado) {
		return soldado.getEdad() > 30 ? largo * 3 : largo * 2;
	}
}
