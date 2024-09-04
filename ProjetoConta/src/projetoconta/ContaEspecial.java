package projetoconta;

public class ContaEspecial extends Conta {
    private double limite;
    
    public ContaEspecial (double limite) {
       
        super(0.0);
        this.limite = limite;
    }
   
    public ContaEspecial (Cliente cliente, double saldo, double limite) {
        super (cliente, saldo);
        this.limite = limite;
    }

    public double getLimite () {
        return limite;
    }

    public void setLimite (double limite) {
        this.limite = limite;
    }
   
    @Override
    public boolean sacar (double valor) {
        if (valor > limite + saldo) {
            return false;
    }
        saldo = saldo - valor;
        return true;
    }

    @Override
    public String imprimeSaldo() {
   
    	return super.imprimeSaldo() + "\nLimite: " + limite;  
   
}

   
}
