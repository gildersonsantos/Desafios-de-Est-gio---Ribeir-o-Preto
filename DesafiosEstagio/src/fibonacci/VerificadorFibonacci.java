package fibonacci;

public class VerificadorFibonacci {
    private static boolean eQuadradoPerfeito(int numero) {
        double sqrtNum = (int) Math.sqrt(numero);
        return sqrtNum * sqrtNum == numero;
    }
    
    public static boolean eFibonacci(int numero) {
        return eQuadradoPerfeito(5 * numero * numero + 4) || eQuadradoPerfeito(5 * numero * numero - 4);
    }
}