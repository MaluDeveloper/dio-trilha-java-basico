import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws ParametrosInvalidosException {

        int parametroUm;
        int parametroDois;
        try (Scanner terminal = new Scanner(System.in)) {
            System.out.println("Digite o primeiro numero");
            parametroUm = terminal.nextInt();
            System.out.println("DIgite o segundo numero");
            parametroDois = terminal.nextInt();
        }
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
        
        contar(parametroUm, parametroDois);
    
    
    }
    
    static void contar(int parametroUm, int parametroDois) {

        for (int i = parametroUm; i < parametroDois; i++) {
            System.out.println("Contagem: " + i);
        }
    }

}