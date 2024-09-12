package calculoDeSoma;

public class CalculadoraDeSoma {
    public static void main(String[] args) {
        int indice = 12;
        int soma = 0;
        int k = 1;

        while (k < indice) {
            k++;
            soma = soma + k;
        }

        System.out.println("O resultado da variavel SOMA é: " + soma);
    }

    // Ao final do processamento, qual será o valor da variável SOMA? Será "77".
}
