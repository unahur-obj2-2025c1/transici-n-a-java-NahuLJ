package planetas;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import personas.Persona;

public class Planeta {
	private Set<Persona> habitantes = new HashSet<>();
	private Integer cantMuseos = 0;
	private Integer cantMurallas = 0;
	
	public Planeta() {
		
	}
	
	public Planeta(Integer cantMuseos) {
		this.cantMuseos = cantMuseos;
	}
	
	public Planeta(Set<Persona> habitantes, Integer cantMuseos) {
		this.habitantes = habitantes;
		this.cantMuseos = cantMuseos;
	}
	
	public Planeta(Set<Persona> habitantes, Integer cantMuseos, Integer cantMurallas) {
		this.habitantes = habitantes;
		this.cantMuseos = cantMuseos;
		this.cantMurallas = cantMurallas;
	}
	
	public void agregarHabitante(Persona habitante) {
		habitantes.add(habitante);
	}
	
	public Set<Persona> getHabitantes() {
		return habitantes;
	}
	
	public Set<Persona> delegacionDiplomatica(){
		return habitantes.stream().filter(h -> h.esDestacado()).collect(Collectors.toSet());
	}
	
	public Integer getDefensa() {
		return Integer.valueOf((int) habitantes.stream().filter(h -> h.getPotencia() >= 30).count());
	}
	
	public Boolean esCulto() {
		return cantMuseos >= 2 && habitantes.stream().allMatch(h -> h.getInteligencia() >= 10);
	}
	
	public Integer potenciaReal() {
		return habitantes.stream().map(h -> h.getPotencia()).reduce(0, Integer::sum);
	}
	
	public void construirMurallas(Integer cantidad) {
		this.cantMurallas += cantidad;
	}
	
	public void fundarMuseo() {
		this.cantMuseos += 1;
	}
	
	public Integer potenciaAparente() {
		Integer poderHabMasPotente = habitantes.stream().mapToInt(Persona::getPotencia).max().orElse(0);
		return poderHabMasPotente * habitantes.size();
	}
	
	public Boolean necesitaEsforzarse() {
		return this.potenciaAparente() * 2 >= this.potenciaReal();
	}
	
	public void recibirAtributos() {
		habitantes.stream().forEach(h -> h.ofrecerTributo(this));
	}
	
	public HashSet<Persona> habitantesValiosos(){
		return habitantes.stream().filter(h -> h.valor() >= 40).collect(Collectors.toCollection(HashSet::new));
	}
}
