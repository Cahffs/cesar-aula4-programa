package projetoconta;

public class Endereco {
	private String rua;
	private String numero;
	private String cep;
	
	
	
	
	
	
		
	public void setRua(String rua) {
		this.rua = rua;
	}
	
		
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	
	public String enderecoCompleto () {
        return "Rua: " + rua + 
        		"\nNúmero: " + numero +
        		"\nCEP: " + cep;         		
    }
}
