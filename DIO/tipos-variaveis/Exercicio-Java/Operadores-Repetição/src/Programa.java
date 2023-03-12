import java.util.Scanner;

public class Programa {
    /**
     * @param args
     */
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {

            System.out.println("Meses, Sobrinho poupara o dimheiro:  ");
            int entrada = leitor.nextInt();
            int mesada = 50;

            mesada = mesada * entrada;
            System.out.println("O valor no final do meses:  " + mesada + " Reais" );
            
        }
    }
}
