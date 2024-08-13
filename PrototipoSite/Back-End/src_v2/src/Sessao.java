import java.text.SimpleDateFormat;
import java.util.Date;

public class Sessao {

	private Date dataSessao = Data();
	private Date horarioSessao = Data();

	public Sessao(Date dataSessao, Date horarioSessao) {
		this.dataSessao = dataSessao;
		this.horarioSessao = horarioSessao;
	}

	public Date getDataSessao() {
		return dataSessao;
	}

	private void setDataSessao(Date dataSessao) {
		this.dataSessao = dataSessao;
	}

	public Date getHorarioSessao() {
		return horarioSessao;
	}

	private void setHorarioSessao(Date horarioSessao) {
		this.horarioSessao = horarioSessao;
	}

	/*
	 * Serve para trocar a horas de milisegundos(default) para a forma como
	 * acostumamos a ver.
	 */
	SimpleDateFormat arrumarHora = new SimpleDateFormat("HH:mm:ss");

	// Método auxiliar para criar uma instância da data
	public Date Data() {
		Date data = new Date();
		return data;
	}

	
	public void DefinirDataSessao() {
		setDataSessao(dataSessao);
	}

	public void DefinirHoraSessao() {
		setHorarioSessao(horarioSessao);
	}
}
