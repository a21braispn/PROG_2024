package proba;

import java.util.Scanner;

public class proba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("===== Menú de Opciones =====");
            System.out.println("1. Saludar");
            System.out.println("2. Mostrar la fecha actual");
            System.out.println("3. Realizar una operación matemática");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("¡Hola! Espero que estés teniendo un buen día.");
                    break;

                case 2:
                    System.out.println("La fecha actual es: " + java.time.LocalDate.now());
                    break;

                case 3:
                    System.out.print("Ingresa el primer número: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Ingresa el segundo número: ");
                    double num2 = scanner.nextDouble();
                    System.out.println("La suma de los números es: " + (num1 + num2));
                    break;

                case 4:
                    System.out.println("Saliendo del programa. ¡Adiós!");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, intenta de nuevo.");
            }

            System.out.println(); // Línea en blanco para separar las iteraciones
        } while (opcion != 4);

        scanner.close();
    }
}
