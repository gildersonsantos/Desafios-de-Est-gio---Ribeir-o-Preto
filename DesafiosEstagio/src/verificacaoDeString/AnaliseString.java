package verificacaoDeString;

import java.util.List;

public class AnaliseString {
    public static boolean contemLetra(char letra, String texto) {
        String textoTratadoMinusculo = texto.trim().toLowerCase();
        String letraMinuscula = String.valueOf(letra).toLowerCase();
        
        return textoTratadoMinusculo.contains(letraMinuscula);
    }

    public static int contarCaracteres(char letra, String texto) {
        String textoTratadoMinusculo = texto.trim().toLowerCase();
        char letraMinuscula = Character.toLowerCase(letra);
        
        int contador = 0;
        for (char caractere : textoTratadoMinusculo.toCharArray()) {
            if (caractere == letraMinuscula) {
                contador++;
            }
        }

        return contador;
    }
}
