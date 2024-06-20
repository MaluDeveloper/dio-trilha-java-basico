import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
         Locale.setDefault(Locale.US);
        // Inicialização do Scanner para captura de entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Mensagens para solicitar informações ao usuário
        System.out.println("Bem-vindo ao sistema de criação de conta bancária!");
        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine().trim(); // Utiliza trim para remover espaços extras

        System.out.print("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        System.out.print("Por favor, digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine().trim();

        System.out.print("Por favor, digite o saldo da Conta: ");
        double saldo = scanner.nextDouble();

        // Construção da mensagem final utilizando concatenação de Strings
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";

        // Exibição da mensagem final
        System.out.println(mensagem);
        
        // Fechar o scanner após a leitura dos dados
        scanner.close();
    }
}
