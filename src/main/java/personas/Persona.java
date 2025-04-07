package personas;

import planetas.Planeta;

public class Persona {
	private Integer edad;
	
	public Persona(Integer edad) {
		this.edad = edad;
	}
	
	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
	public Integer getInteligencia() {
		if (edad >= 20 && edad <= 40) {
			return 12;
		}
		return 8;
	}

	public Integer getPotencia() {
		return 20;
	}
	
	public Boolean esDestacado() {
		return edad == 25 || edad == 35;
	}
	
	public void ofrecerTributo(Planeta planeta) {}
	
	public Integer valor() {
		return this.getInteligencia() + this.getPotencia();
	}
}
