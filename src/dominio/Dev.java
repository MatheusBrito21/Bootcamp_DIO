package dominio;

import java.util.ArrayList;
import java.util.List;

public class Dev {
	private String nome;
	private List<Mentoria> mentorias = new ArrayList<>();
	private List<Bootcamp> bootcamps = new ArrayList<>();
	
	private List<Curso> cursosConcluidos = new ArrayList<>();
	private List<Mentoria> mentoriasConcluidos = new ArrayList<>();
	
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
	
	public List<Mentoria> getMentoriasConcluidos() {
		return mentoriasConcluidos;
	}

	public void setMentoriasConcluidos(List<Mentoria> mentoriasConcluidos) {
		this.mentoriasConcluidos = mentoriasConcluidos;
	}

	public void inscriverBootcamp(Bootcamp bc) {
		this.bootcamps.add(bc);
		bc.getDevsInscritos().add(this);
	}
	public void inscriverMentoria(Mentoria m) {
		this.mentorias.add(m);
	}
	
	public void concluirCurso(Curso c) {
		this.cursosConcluidos.add(c);
	}
	public void concluirMentoria(Mentoria m) {
		this.mentoriasConcluidos.add(m);
	}
	
	public double calcularTotalXP() {
		double totalCursos = 0;
		double totalMentorias = 0;
		
		for (Curso c: cursosConcluidos) {
			totalCursos += c.calcularXP(); 
		}
		
		for (Mentoria m: mentoriasConcluidos) {
			totalMentorias += m.calcularXP(); 
		}
		return totalCursos+totalMentorias; 	
	}

	@Override
	public String toString() {
		return "Dev " + nome +
				" - XP Total = "+calcularTotalXP();
	}
	
	
}
