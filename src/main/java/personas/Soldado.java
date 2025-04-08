package personas;

import java.util.HashSet;
import java.util.Set;

import armas.*;
import planetas.Planeta;

public class Soldado extends Persona {
	private Set<Arma> armas = new HashSet<>();
	
	public Soldado(Integer edad) {
		super(edad);
	}
	
	@Override 
	public Integer getPotencia() {
		Integer potenciaArmas = armas.stream().map(a -> a.potencia(this)).reduce(0, Integer::sum);
		return super.getPotencia() + potenciaArmas; 
	}
	
	@Override
	public void ofrecerTributo(Planeta planeta) {
		planeta.construirMurallas(5);
	}
	
}
