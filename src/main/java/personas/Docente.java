package personas;

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
	public Integer inteligencia() {
		return super.inteligencia() + cantCursos * 2;
	}
	
}
