public class Terapeuta extends Pessoa {
	private long CITRG;
	private double precoSessao;
	private Paciente paciente;
	private Pagamento pagamento;
	private Sessao sessao;

	public Terapeuta(String nome, Long contato, String email, String senha, long citrg) {
		super(nome, contato, email, senha);
		CITRG = citrg;
	}

	public long getCITRG() {
		return CITRG;
	}

	public void setCITRG(long cITRG) {
		CITRG = cITRG;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public double getPrecoSessao() {
		return precoSessao;
	}

	public void setPrecoSessao(double precoSessao) {
		this.precoSessao = precoSessao;
	}

	public Pagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}

	public Sessao getSessao() {
		return sessao;
	}

	public void setSessao(Sessao sessao) {
		this.sessao = sessao;
	}

	public double definirPreco() {
		setPrecoSessao(precoSessao);
		return this.precoSessao;
	}

	public double definirDescontos() {
		if (paciente.getQtdeSessoes() >= 5) {
			return pagamento.getDesconto();
		} else {
			pagamento.setDesconto(0);
			return pagamento.getDesconto();
		}
	}

	public void reembolsarCliente() {
		pagamento.setFormaDePag(false);
		paciente.pagarSessao();
	}
}
