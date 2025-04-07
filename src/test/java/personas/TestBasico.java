package personas;

import planetas.Planeta;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.HashSet;



public class TestBasico {
	
	private Persona julieta = new Persona(42);
	private Atleta ana = new Atleta(25);
	private Atleta rosa = new Atleta(45,8);
	private Atleta perla = new Atleta(28,4,6);
	private Docente monica = new Docente(45,6);
	private Docente luisa = new Docente(35,1);
	
	private Planeta triton = new Planeta();
	
	@BeforeEach
	private void init() {
		triton.agregarHabitante(julieta);
		triton.agregarHabitante(ana);
		triton.agregarHabitante(rosa);
		triton.agregarHabitante(perla);
		triton.agregarHabitante(monica);
		triton.agregarHabitante(luisa);
	}
	
	@Test
	void valoresJulieta() {
	    assertEquals(julieta.getPotencia(),20);
	    assertEquals(julieta.getInteligencia(),8);
	    assertFalse(julieta.esDestacado());
	}
	
	@Test
	void valoresAna() {
	    assertEquals(ana.getPotencia(),28);
	    assertEquals(ana.getInteligencia(),12);
	    assertTrue(ana.esDestacado());
	}
	
	@Test
	void valoresRosa() {
	    assertEquals(rosa.getPotencia(),52);
	    assertEquals(rosa.getInteligencia(),8);
	    assertTrue(rosa.esDestacado());
	}
	
	@Test
	void valoresPerla() {
	    assertEquals(perla.getPotencia(),44);
	    assertEquals(perla.getInteligencia(),12);
	    assertFalse(perla.esDestacado());
	}
	
	@Test
	void valoresMonica() {
	    assertEquals(monica.getPotencia(),20);
	    assertEquals(monica.getInteligencia(),20);
	    assertTrue(monica.esDestacado());
	}
	
	@Test
	void valoresLuisa() {
	    assertEquals(luisa.getPotencia(),20);
	    assertEquals(luisa.getInteligencia(),14);
	    assertFalse(luisa.esDestacado());
	}
	
	@Test
	void valoresPlanetaTriton() {
		assertEquals(triton.delegacionDiplomatica(), new HashSet<>(Arrays.asList(ana, rosa, monica)));
	    assertEquals(triton.getDefensa(),2);
	    assertFalse(triton.esCulto());
	    assertEquals(triton.potenciaReal(),184);
	}
	
	@Test
	void perlaLuegoDeEntrenar() {
		perla.entrenar(15);
		perla.aprenderTecnica();
		assertEquals(perla.getPotencia(),65);
	    assertFalse(perla.esDestacado());
	    perla.aprenderTecnica();
	    assertTrue(perla.esDestacado());
	}
	
}