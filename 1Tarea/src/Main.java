import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int option;

        do {
            System.out.println("Menú de Ejercicios:");
            System.out.println("1. Hola Mundo");
            System.out.println("2. Suma de dos números");
            System.out.println("3. Número par o impar");
            System.out.println("4. Factorial de un número");
            System.out.println("5. Tabla de multiplicar");
            System.out.println("6. Salir");
            System.out.print("Selecciona una opción: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    ejercicioHolaMundo();
                    break;
                case 2:
                    ejercicioSumaDosNumeros();
                    break;
                case 3:
                    ejercicioNumeroParImpar();
                    break;
                case 4:
                    ejercicioFactorial();
                    break;
                case 5:
                    ejercicioTablaMultiplicar();
                    break;
                case 6:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (option != 6);

        scanner.close();
    }


    private static void ejercicioHolaMundo() {
        System.out.println("Hola Mundo");
    }


    private static void ejercicioSumaDosNumeros() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el primer número: ");
        int numero1 = scanner.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int numero2 = scanner.nextInt();
        int suma = numero1 + numero2;
        System.out.println("La suma de los dos números es: " + suma);
    }


    private static void ejercicioNumeroParImpar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println(numero + " es un número par");
        } else {
            System.out.println(numero + " es un número impar");
        }
    }


    private static void ejercicioFactorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();

        int factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }

        System.out.println("El factorial de " + numero + " es: " + factorial);
    }


    private static void ejercicioTablaMultiplicar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();

        System.out.println("Tabla de multiplicar del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}
