import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimulacaoBancaria {

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
        double saldo = 0;
        Boolean continuar = true;
        
        while (continuar) {
            System.out.println("==== Menu ====");
            System.out.println("1. Depositar: ");
            System.out.println("2. sacar:");
            System.out.println("3. Consultar Saldo: ");
            System.out.println("4. Encerrar: ");
            System.out.print("Escolha uma opção: ");
            
            int opcao = Integer.parseInt(reader.readLine());

            switch (opcao) {
                case 1 -> {
                    System.out.println("Digite o valor a ser depositado: ");
                    double valorDeposito = Double.parseDouble(reader.readLine());
                    saldo += valorDeposito;
                    System.out.println("Saldo atual:" + saldo);
                }
                case 2 -> {
                     System.out.println("Digite o valor a ser sacado: ");
                    double valorSaque = Double.parseDouble(reader.readLine());
                    if(valorSaque > saldo) {
                      System.out.println(" Saldo insuficiente");
                    } else {
                      saldo -= valorSaque;
                      System.out.println("Saldo atual:" + saldo);
                    }
                }
                case 3 -> System.out.println("Saldo atual:" + saldo);
                case 0 -> {
                    System.out.println("Programa encerrado.");
                    continuar = false;
                }
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
         }
      }
   }
}