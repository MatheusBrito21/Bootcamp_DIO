package dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Bootcamp {
	private String nome;
	private String descricao;
	private LocalDate dataInicio = LocalDate.now();
	private LocalDate dataTermino = dataInicio.plusDays(45);
	
	private List<Dev> devsInscritos = new ArrayList<>();
	private List<Curso> cursos = new ArrayList<>();
	private List<Mentoria> mentorias = new ArrayList<>();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public LocalDate getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}
	public LocalDate getDataTermino() {
		return dataTermino;
	}
	public void setDataTermino(LocalDate dataTermino) {
		this.dataTermino = dataTermino;
	}
	public List<Dev> getDevsInscritos() {
		return devsInscritos;
	}
	public void setDevsInscritos(List<Dev> devsInscritos) {
		this.devsInscritos = devsInscritos;
	}
	public List<Curso> getCursos() {
		return cursos;
	}
	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}
	public List<Mentoria> getMentorias() {
		return mentorias;
	}
	public void setMentorias(List<Mentoria> mentorias) {
		this.mentorias = mentorias;
	}
	@Override
	public String toString() {
		return "\nBootcamp " + nome + "\ndescricao=" + descricao + "\ndataInicio=" + dataInicio + "\ndataTermino="
				+ dataTermino + "\ndevsInscritos=" + devsInscritos + "\ncursos=" + cursos + "\nmentorias=" + mentorias
				+ "]";
	}
	
	
	
}
