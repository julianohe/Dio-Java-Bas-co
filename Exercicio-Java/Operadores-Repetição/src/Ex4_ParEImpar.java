import java.util.Scanner;

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int quantNumeros;
            int numero;
            int quantPares = 0,quantImpares = 0;

            System.out.println("Quantidade de Numeros:  ");
            quantNumeros = scan.nextInt();

            int count = 0;
            do{
                System.out.println("Numero:  ");
                numero = scan.nextInt();
                if(numero % 2 == 0) quantPares++;
                else quantImpares++;

                count = count + 1;
            }while(count > quantNumeros);
            System.out.println("Quantidade de   Par:  " + quantPares);
            System.out.println("Quantidade de Impar:  " + quantImpares);

        }
        
    }
}
