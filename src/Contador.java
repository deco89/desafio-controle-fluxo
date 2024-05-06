import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = sc.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = sc.nextInt();

        try {
            if (parametroDois <= parametroUm) {
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
            }
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException exception) {
            System.out.println(exception.getMessage());
        }

        sc.close();
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        int contagem = parametroDois - parametroUm;

        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
