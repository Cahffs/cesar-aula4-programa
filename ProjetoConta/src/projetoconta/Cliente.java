package projetoconta;

public class Cliente {
    //atributos
    private String nome;
    private String cpf;

    
    public Cliente(){
    }
    
    public Cliente (String nome, String cpf) {
        this.nome = nome;
        this.cpf=cpf;        
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

   public String dadosCompleto () {
        return "Nome: " + nome + 
        		"\nCPF: " + cpf;        		
    }
    
    
}