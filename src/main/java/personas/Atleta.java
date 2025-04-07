package personas;

import planetas.Planeta;

public class Atleta extends Persona {
	private Integer masaMuscular = 4;
	private Integer cantTecnicas = 2;
	
	public Atleta(Integer edad) {
		super(edad);
	}
	
	public Atleta(Integer edad, Integer cantTecnicas) {
		super(edad);
		this.cantTecnicas =  cantTecnicas;
	}
	
	public Atleta(Integer edad, Integer cantTecnicas, Integer masaMuscular) {
		super(edad);
		this.cantTecnicas =  cantTecnicas;
		this.masaMuscular =  masaMuscular;
	}
	
	@Override
	public Integer getPotencia() {
		return super.getPotencia() + masaMuscular * cantTecnicas;
	}
	
	
	@Override
	public Boolean esDestacado() {
		return super.esDestacado() || cantTecnicas > 5;
	}
	
	public void entrenar(Integer dias) {
		this.masaMuscular += dias / 5;
	}
	
	public void aprenderTecnica() {
		this.cantTecnicas += 1;
	}
	
	@Override
	public void ofrecerTributo(Planeta planeta) {
		planeta.construirMurallas(2);
	}
}
