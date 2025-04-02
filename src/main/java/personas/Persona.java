package personas;

public abstract class Persona {
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
	
	public Integer inteligencia() {
		if (edad >= 20 && edad <= 40) {
			return 12;
		}
		return 8;
	}

	public Integer potencia() {
		return 20;
	}
	
	public Boolean esDestacado() {
		return edad == 25 || edad == 35;
	}
	// prueba commit
}
