import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o número da conta: ");
        int numConta = scanner.nextInt();

        System.out.print("Digite o saldo inicial: ");
        double saldo = scanner.nextDouble();

        ContaBancaria conta1 = new ContaBancaria(nome, numConta, saldo);
        System.out.println("Conta bancária criada com sucesso.");
        conta1.exibirInformacoes();

        conta1.depositar(13.00);
        conta1.sacar(4.00);
        scanner.close();
    }
}
