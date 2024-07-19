import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int numMax = Integer.MIN_VALUE;
        int numMin = Integer.MAX_VALUE;
        System.out.println("Ingrese números enteros (negativo para terminar):");

        do {
            numero = scanner.nextInt();

            if (numero >= 0) {
                if (numero > numMax) {
                    numMax = numero;
                }

                if (numero < numMin) {
                    numMin = numero;
                }
            }
        } while (numero >= 0);

        System.out.println("Número máximo: " + numMax);
        System.out.println("Número mínimo: " + numMin);

        scanner.close();
    }
}
