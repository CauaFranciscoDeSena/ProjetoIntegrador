import java.util.Date;

public class Paciente {
    private Date dataNascimento;
    private Pagamento pagamento;
    private Sessao sessoes;
    private int QtdeSessoes;

    public Paciente(){}

    public Paciente(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public Sessao getSessoes() {
        return sessoes;
    }

    public void setSessoes(Sessao sessoes) {
        this.sessoes = sessoes;
    }

    public int getQtdeSessoes() {
        return QtdeSessoes;
    }

    public void setQtdeSessoes(int qtdeSessoes) {
        QtdeSessoes = qtdeSessoes;
    }

    public void agendarSessao(){
        for (int i = 0; i >= getQtdeSessoes();i++){
            sessoes.DefinirDataSessao();
        }
    }

    public void cancelarSessao(){
        //Código para cancelar a sessão.
    }

    public void pagarSessao(){
       double valorFinal = pagamento.getTotal() - pagamento.getDesconto();
       pagamento.setTotal(valorFinal); 
    }
}
