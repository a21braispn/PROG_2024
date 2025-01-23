package exer1;

import java.util.Scanner;

public class exer1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce a cantidade de números que desexas introducir: ");
        int cantidade = scanner.nextInt();

        double[] numeros = new double[cantidade];

        System.out.println("Introduce os números:");
        for (int i = 0; i < cantidade; i++) {
            System.out.print("Número: ");
            numeros[i] = scanner.nextDouble();
        }

        System.out.println("Os números en orde inversa son:");
        for (int i = cantidade - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }

        scanner.close();
    }
}
