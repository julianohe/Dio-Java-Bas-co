import java.util.Scanner;

public class Ex2_Nota {
    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            int nota;
            
            System.out.println("Nota:   ");
            nota = scan.nextInt();

            while (nota < 0 | nota > 10) {
                
            System.out.println("Nota Invalida!Digite novamente:...");
            nota = scan.nextInt();

                
            }
        }
    }
}
