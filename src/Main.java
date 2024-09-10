import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um número inteiro para saber se ele faz parte da sequência de Fibonacci:");
        int numero = leitura.nextInt();

        long[] fib = Calculo.gerarFibonacci(numero+1);
        if (Calculo.confirmar(numero, fib)) {
            System.out.println(numero + " é um número Fibonacci");
        } else
            System.out.println(numero + " não é um número Fibonacci");
    }
}