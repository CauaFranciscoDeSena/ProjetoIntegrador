public class Pagamento {
    private double desconto;
    private double total;
    private boolean formaDePag;
    
    public Pagamento(double total) {
        this.total = total;
    }

    public Pagamento(double desconto, boolean formaDePag) {
        this.desconto = desconto;
        this.formaDePag = formaDePag;
    }

    
    
    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public boolean getFormaDePag() {
        return formaDePag;
    }

    public void setFormaDePag(boolean formaDePag) {
        this.formaDePag = formaDePag;
    }

    public Boolean habilitarDesconto(){
       return true; 
    }

    public void mostrarTotal(){
        System.out.println(total);
    }

    public boolean formaDePag(){
        return true;
    }

    public boolean verificarPag(){
        return true;
    }
}
