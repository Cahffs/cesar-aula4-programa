package projetoconta;

public class Conta {
    //atributos
	
    private Cliente cliente;
    private Endereco endereco;
    protected double saldo;
    
    //método construtor
    public Conta () {
        saldo = 0.0;
    }
    
    //método construtor (sobrecarregado)
    public Conta (double saldo) {
    this.saldo = saldo;
    }
    
    //método construtor (sobrecarregado)
    public Conta (Cliente cliente, double saldo) {
    this.cliente = cliente;
    this.saldo = saldo;
    }
    
    //acesso aos dados do cliente
    public Cliente getCliente () {
        return cliente;
    }
    
    //estabelece os dados do cliente
    public void setCliente (Cliente cliente) {
        this.cliente = cliente;
    }
    
    //acesso aos dados do endereço
    public Endereco getEndereco () {
    	return endereco;
    }
    
    
    //estabelece os dados do endereço
    public void setEndereco (Endereco endereco) {
    	this.endereco = endereco;
    }
    
    //acesso ao valor do saldo
    public double getSaldo () {
        return saldo;
    }
    
    //método depositar
    public void depositar (double valor) {
    saldo = saldo + valor;
    }
    
    //método sacar (apenas se o valor sacado for maior que o saldo
    public boolean sacar (double valor) {
    if (valor > saldo){
        return false; 
    }
     saldo = saldo - valor;
     return true;
    }
    
    //método imprimir saldo
    public String imprimeSaldo () {
        return "Saldo: R$" + saldo;
    }
    
    //método sobrecarregado: imprime saldo com cliente
    public String imprimeSaldo (boolean comCliente) {
        if (comCliente) {
        return cliente.dadosCompleto() + "\n" + imprimeSaldo() + "\n" + endereco.enderecoCompleto();
        } 
        return imprimeSaldo();
    }
} // fim da conta