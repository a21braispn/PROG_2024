import java.util.Scanner;

public class a {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Número: ");
        int numero = scanner.nextInt();

        if (numero == 6174) {
            System.out.println(0);
        } else if (esRepdigit(numero)) {
            System.out.println(-1);
        } else if (numero >= 1000 && numero <= 9999) {
            int iteraciones = calcularKaprekar(numero);
            System.out.println(iteraciones);
        } else {
            System.out.println("ERROR: Introduzca un número válido");
        }

        scanner.close();
    }

    private static int calcularKaprekar(int numero) {
        int iteraciones = 0;
        int restas = numero;
        while (restas != 6174 && iteraciones < 100) {
            int menor = obtenerMenor(restas);
            int mayor = obtenerMayor(restas);
            restas = mayor - menor;
            iteraciones++;
        }
        return iteraciones;
    }

    private static int obtenerMenor(int numero) {
        char[] digitos = String.valueOf(numero).toCharArray();
        java.util.Arrays.sort(digitos);
        return Integer.parseInt(new String(digitos));
    }

    private static int obtenerMayor(int numero) {
        char[] digitos = String.valueOf(numero).toCharArray();
        java.util.Arrays.sort(digitos);
        return Integer.parseInt(new StringBuilder(new String(digitos)).reverse().toString());
    }

    private static boolean esRepdigit(int numero) {
        int d1 = numero / 1000;
        int d2 = (numero / 100) % 10;
        int d3 = (numero / 10) % 10;
        int d4 = numero % 10;
        return (d1 == d2 && d1 == d3 && d1 == d4);
    }
}
