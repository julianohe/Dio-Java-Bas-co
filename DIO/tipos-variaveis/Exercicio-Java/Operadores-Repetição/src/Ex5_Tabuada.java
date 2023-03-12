import java.util.Scanner;

/**
 * Desenvolva um gerador de Tabuada,
 * capaz de gerar a tabuada de qualquer numero inteiro entre 1 a 10.
 * O usuario deve informar de qual numero ele deseja ver a tabuada.
 * A saida deve ser conforme o exemplo abaixo:
 * 
 * Tabuada de 5:
 * 5 X 1 = 5
 * 5 X 2 =10
 * ...
 * 5 X 10 = 50 

*/


public class Ex5_Tabuada {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {


            System.out.println("A Tabuada:  ");
            int tabuada = scan.nextInt();

            System.out.println("Tabuada de " + tabuada);

            for (int i = 1; i<= 10; i++) {
                System.out.println(tabuada + " x " + i + " = " + (tabuada*i));
            }

        }

    }
}
