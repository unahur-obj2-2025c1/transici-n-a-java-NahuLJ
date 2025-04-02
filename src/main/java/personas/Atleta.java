package personas;

public class Atleta extends Persona {
	private Integer masaMuscular = 4;
	private Integer cantTecnicas = 2;
	
	public Atleta(Integer edad, Integer cantTecnicas) {
		super(edad);
		this.cantTecnicas =  cantTecnicas;
	}
	
	@Override
	public Integer potencia() {
		return super.potencia() + masaMuscular * cantTecnicas;
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
}
