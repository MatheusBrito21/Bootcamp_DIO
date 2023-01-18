package dominio;

public class Curso extends Conteudo {

	@Override
	public double calcularXP() {
		return XP_PADRAO * getCargaHoraria();
	}
	
	@Override
    public String toString() {
        return 
                "\n	titulo='" + getTitulo() + '\'' +
                "\n 	descricao='" + getDescricao() + '\'' +
                " carga horaria=" + getCargaHoraria()+
                '}';
    }
}
