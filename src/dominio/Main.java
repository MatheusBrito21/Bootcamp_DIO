package dominio;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {

		Bootcamp java = new Bootcamp();
		java.setNome("Java Bootcamp - 2023");
		java.setDescricao("Dominando a linguagem Java");
		
		Curso pooJava = new Curso();
		pooJava.setTitulo("Programa��o OO - Java");
		pooJava.setDescricao("Aprenda o paradigma de OO com a linguagem Java.");
		pooJava.setCargaHoraria(2);
		
		Mentoria javaOCP = new Mentoria();
		javaOCP.setTitulo("Java Certified Professional");
		javaOCP.setDescricao("Como se preparar para a Certifica��o Java da Oracle.");
		javaOCP.setCargaHoraria(3);
		javaOCP.setData(LocalDate.of(2023, 2, 1));
		
		
		java.getCursos().add(pooJava);
		java.getMentorias().add(javaOCP);
		
		
		Dev matheus = new Dev();
		matheus.setNome("Matheus Brito");

		
		System.out.println(java);
//		System.out.println(java.getCursos().get(0).calcularXP());
	}
}
