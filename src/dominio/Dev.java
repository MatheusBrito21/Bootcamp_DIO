package dominio;

import java.util.ArrayList;
import java.util.List;

public class Dev {
	private String nome;
	private List<Mentoria> mentorias = new ArrayList<>();
	private List<Bootcamp> bootcamps = new ArrayList<>();
	
	private List<Curso> cursosConcluidos = new ArrayList<>();
	
	public Dev() {
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Mentoria> getMentorias() {
		return mentorias;
	}
	public void setMentorias(List<Mentoria> mentorias) {
		this.mentorias = mentorias;
	}
	public List<Bootcamp> getBootcamps() {
		return bootcamps;
	}
	public void setBootcamps(List<Bootcamp> bootcamps) {
		this.bootcamps = bootcamps;
	}

	public List<Curso> getCursosConcluidos() {
		return cursosConcluidos;
	}

	public void setCursosConcluidos(List<Curso> cursosConcluidos) {
		this.cursosConcluidos = cursosConcluidos;
	}
	
	
	
	
}
