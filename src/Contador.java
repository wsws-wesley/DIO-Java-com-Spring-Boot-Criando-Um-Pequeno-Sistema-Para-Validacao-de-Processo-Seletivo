import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        try {
            validarParametros();
        } catch (ParametrosInvalidosException exception) {
            System.out.println("O parâmetro dois obrigatoriamente deve ser maior que o parâmetro um!");
        }

    }

    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem; i++) {
            System.out.println(i);
        }
    }

    static void validarParametros() throws ParametrosInvalidosException {
        Scanner terminal = new Scanner(System.in);

        try {
            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro");
            int parametroDois = terminal.nextInt();
            contar(parametroUm, parametroDois);
        } catch (InputMismatchException exception) {
            System.out.println("Os parâmetros um e dois obrigatoriamente devem ser números inteiros!");
        }
    }
}