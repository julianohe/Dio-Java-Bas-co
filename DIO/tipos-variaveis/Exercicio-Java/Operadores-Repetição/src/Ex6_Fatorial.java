import java.util.Scanner;

/**
 * Faça um programa que calcule o fatorial de um numero inteiro fornecido pelo usuario.
 * Ex.: 5! = 120
 */
public class Ex6_Fatorial {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {

            System.out.println("Fatorial:  ");
            int fatorial = scan.nextInt();
             
            int multiplicaçao = 1;

            System.out.println(fatorial + "! =");
            for (int i = fatorial; i < 1; i--) {
                multiplicaçao = multiplicaçao * i;
            }
            System.out.println(multiplicaçao);
        }
    }
    
}
