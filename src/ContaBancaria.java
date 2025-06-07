public class ContaBancaria {
    private String nome;
    private int numConta;
    private double saldo;

    public ContaBancaria(String nome, int numConta, double saldo) {
        this.nome = nome;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public void depositar(double deposito){
        saldo += deposito;
        System.out.println("Depósito de R$" + deposito + " realizado com sucesso.");
        System.out.println("Saldo atual: " + saldo);
    }

    public void sacar(double saque){
        this.saldo -= saque;
        if(saque>saldo){
            System.out.println("Saldo insuficiente para realizar a operação.");
        } else if(saque > 5.000){
            System.out.println("Valor do saque acima do permitido.");
        } else {
            System.out.println("Saque de R$ " + saque + " realizado com sucesso.");
        }
        System.out.println("Saldo atual: " + saldo);
    }

    public double getSaldo() {
        return saldo;
    }

    public void exibirInformacoes(){
        System.out.println("Informações da conta: ");
        System.out.println("Nome: " + nome);
        System.out.println("Número da conta: " + numConta);
        System.out.println("Saldo: " + saldo);
    }


    
}
