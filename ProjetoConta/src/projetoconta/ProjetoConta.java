package projetoconta;


import javax.swing.JOptionPane;

public class ProjetoConta {

    
    public static void main(String[] args) {

        Conta conta = new ContaEspecial(1000.0);
        Cliente cliente = new Cliente();
        Endereco endereco = new Endereco();
        
        
        cliente.setNome(JOptionPane.showInputDialog ("Entre com o nome:"));
        cliente.setCpf(JOptionPane.showInputDialog("Entre com o CPF: "));
        endereco.setRua(JOptionPane.showInputDialog("Entre com o nome da rua: "));
        endereco.setNumero(JOptionPane.showInputDialog("Entre com o número da casa: "));
        endereco.setCep(JOptionPane.showInputDialog("Entre com o número do cep: "));
        
        conta.setCliente(cliente);
        conta.setEndereco(endereco);
        
        
    String [] opcoes = new String [] {"Depositar", "Sacar", "Imprimir Saldo", "Sair"};
    String opcao;
    do {
        opcao = (String)JOptionPane.showInputDialog(null, "Escolha uma opção: ", "Menu", JOptionPane.QUESTION_MESSAGE, null, opcoes, "Depositar");
        
        switch (opcao) {
            case "Depositar": 
                conta.depositar(Double.parseDouble(JOptionPane.showInputDialog(("Entre com um valor de depósito: "))));
                break;
            
            case "Sacar": 
               if (!conta.sacar(Double.parseDouble(JOptionPane.showInputDialog ("Entre com o valor do saque: ")))){
                JOptionPane.showMessageDialog(null, "Saldo insuficiente");
                }    
        
            break;
    
            case "Imprimir Saldo":
            JOptionPane.showMessageDialog(null, conta.imprimeSaldo(true)); 
            break;
            
            case "Sair":
               JOptionPane.showMessageDialog(null, "Bye!"); 
               break;
        }
    } while (!opcao.equals("Sair"));
        
    }
}