package personas;

import planetas.Planeta;

public class Docente extends Persona {
	private Integer cantCursos = 0;
	
	public Docente(Integer edad, Integer cantCursos) {
		super(edad);
		this.cantCursos = cantCursos;
	}
	
	@Override
	public Boolean esDestacado() {
		return cantCursos > 3;
	}
	
	@Override
	public Integer getInteligencia() {
		return super.getInteligencia() + cantCursos * 2;
	}
	
	@Override
	public void ofrecerTributo(Planeta planeta) {
		planeta.fundarMuseo();
	}
	
	@Override
	public Integer valor() {
		return super.valor() + 5;
	}
}
