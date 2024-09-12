package verificacaoDeString;

public class TesteAnaliseString {
    public static void main(String[] args) {
        String texto = "A programação é uma habilidade essencial no mundo moderno. Ela permite que as pessoas criem soluções inovadoras para problemas complexos e automatizem tarefas repetitivas. Aprender a programar pode abrir portas para inúmeras oportunidades de carreira e desenvolvimento pessoal.";
        char letra = 'a';

        boolean contem = AnaliseString.contemLetra(letra, texto);
        System.out.println("O texto contém a letra '" + letra + "': " + contem);


        int contagem = AnaliseString.contarCaracteres(letra, texto);
        System.out.println("A letra '" + letra + "' aparece " + contagem + " vezes no texto.");
    }
}
