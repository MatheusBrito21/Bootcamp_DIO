package dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
	
	private LocalDate data;
	
	@Override
	public double calcularXP() {
		return XP_PADRAO * getCargaHoraria()*2;
	}
	
	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate of) {
		this.data = of;
	}

	@Override
    public String toString() {
        return "Mentoria{" +
                "\ntitulo='" + getTitulo() + '\'' +
                "\ndescricao='" + getDescricao() + '\'' +
                "\ndata=" + data +
                '}';
    }

}
