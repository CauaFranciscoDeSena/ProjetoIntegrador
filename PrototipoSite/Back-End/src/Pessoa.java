import java.util.Scanner;

public abstract class Pessoa {
    
    private String nome;
    private Long contato;
    private String email;
    private String senha;

    public Pessoa(){

    }
    
    public Pessoa(String nome, Long contato, String email, String senha) {
        this.nome = nome;
        this.contato = contato;
        this.email = email;
        this.senha = senha;
    }
    
    private String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private Long getContato() {
        return contato;
    }

    private void setContato(Long contato) {
        this.contato = contato;
    }

    private String getEmail() {
        return email;
    }

    private void setEmail(String email) {
        this.email = email;
    }

    private String getSenha() {
        return senha;
    }

    private void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean Cadastrar(){
        Scanner scan = new Scanner(System.in);
        String nomePessoa = scan.nextLine();
        String emailPessoa = scan.nextLine();
        String senhaPessoa = scan.nextLine();
        String contatoPessoa = scan.nextLine();
        scan.close();

        setNome(nomePessoa);
        setNome(emailPessoa);
        setNome(senhaPessoa);
        setNome(contatoPessoa);
        
        return true;
    }

    public boolean Entrar(){
        String validarEmail = "";
        String validarSenha = "";

        if (validarEmail == getEmail() && validarSenha == getSenha()) {
            //Futuro código para redirecionar para a page paciente.
            return true;
        } 
        else {
            System.out.println("E-mail ou senha inválido");
            return false;  
        }
        
    }

    public void TrocarEmail(){
        String emailNovo = "";
        setEmail(emailNovo);
    }

    public void TrocarSenha(){
        String senhaNova = "";
        setSenha(senhaNova);
    }
    
    public void TrocarContato(){
        final long numNovo = 0l;
        setContato(numNovo);
    }

    public void MostrarHistorico(){
        System.out.println("Nome: " + getNome() + "/n Contato: " + getContato());
    }
}
