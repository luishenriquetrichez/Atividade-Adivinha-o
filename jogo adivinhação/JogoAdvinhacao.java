import java.util.Random;
import java.util.Scanner;

public class JogoAdvinhacao {
    public static void main(String[] args) {
        Random geradorNumeroAleatorio = new Random();
        int numeroGerado = geradorNumeroAleatorio.nextInt(100);
        int[] tentativas = {10};
        boolean acertouNumero = false;
        Scanner lertTeclado = new Scanner(System.in);
        int tentativa;
        
        while((tentativas[0] != 0) && (!acertouNumero)){
            System.out.println("Você tem " + tentativas[0] + " tentativas para acertar um número mágico de 1-100, digite um número como tentativa: \n");
            tentativa = lertTeclado.nextInt();
            acertouNumero = comparador(numeroGerado, tentativa, tentativas);
        }
        lertTeclado.close();
    }

    public static boolean comparador(int numeroGerado, int tentativa, int[] tentativas){
        if (numeroGerado != tentativa) {
            tentativas[0] -= 1;
            if (tentativa > numeroGerado) {
                System.out.println("\n O número que você escolheu é maior do que o número mágico, tenta outra vez! \n");
            } else {
                System.out.println("\n O número que você escolheu é menor do que o número mágico, tenta outra vez! \n");
            }
            return false;
        } else {
            System.out.println("Parabéns, você acertou o número mágico!!!");
            return true;
        }
    }
}
