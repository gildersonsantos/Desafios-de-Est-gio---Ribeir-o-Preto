package fibonacci;

public class TesteVerificadorFibonacci {
    public static void main(String[] args) {
        System.out.println("O numero 1 faz parte da Sequência de Fibonacci? " + VerificadorFibonacci.eFibonacci(1));
        System.out.println("O numero 5 faz parte da Sequência de Fibonacci? " + VerificadorFibonacci.eFibonacci(5));
        System.out.println("O numero 13 faz parte da Sequência de Fibonacci? " + VerificadorFibonacci.eFibonacci(13));
        System.out.println("O numero 15 faz parte da Sequência de Fibonacci? " + VerificadorFibonacci.eFibonacci(15));
        System.out.println("O numero 32 faz parte da Sequência de Fibonacci? " + VerificadorFibonacci.eFibonacci(32));
        System.out.println("O numero 34 faz parte da Sequência de Fibonacci? " + VerificadorFibonacci.eFibonacci(34));
        System.out.println("O numero 89 faz parte da Sequência de Fibonacci? " + VerificadorFibonacci.eFibonacci(89));
    }
}
