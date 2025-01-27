import java.util.Scanner;

public class exer1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Numero con al menos 2 cifras diferentes: ");
        int numero = scanner.nextInt();
        if (esRepdigit(numero) != true) {
            int iteracions = 0;
            int restas = numero;
            int numero_r = reves_numero(numero);
            while (restas != 6174) {
                if (restas > numero_r){
                    restas = restas - numero_r;
                    numero_r = reves_numero(restas);
                    iteracions++;
                }
                else{
                    restas =  numero_r - restas;
                    numero_r = reves_numero(restas);
                    iteracions++;
                }

            }
            System.out.println(iteracions + "" + restas);
        }
        else{
            System.out.println("ERROR: Introduzca un numero válido");
        }

        scanner.close();
    }

    private static boolean esRepdigit(int numero) {
        int d1 = numero / 1000;
        int d2 = (numero / 100) % 10;
        int d3 = (numero / 10) % 10;
        int d4 = numero % 10;
        return (d1 == d2 && d1 == d3 && d1 == d4);
    }
    private static int reves_numero(int numero){
        int i = 0;
        int novon = 0;
        while (i != 4) {
            int cifra = numero % 10;
            novon =  novon * 10 + cifra;
            numero /= 10;
            i++;
        }
        return novon;
    }
}