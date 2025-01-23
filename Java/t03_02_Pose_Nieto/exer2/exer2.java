package exer2;

import java.util.Scanner;

public class exer2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lista[] = { 3, 5, 7, 2, 9 };

        while (lista.length > 0) {
            System.out.print("Indice a eliminar: ");
            int indice = scanner.nextInt();

            if (indice < lista.length && indice >= 0) {
                System.out.println(lista[indice]);
                int listaux[] = new int[lista.length - 1];

                int j = 0;

                for (int i = 0; i < lista.length; i++) {
                    if (i != indice) {
                        listaux[j] = lista[i];
                        j++;
                    }
                }

                lista = listaux;
            } 
            else {
                System.out.println("Introduzca un indice válido");
            }
        }
        System.out.println("FIN");
        scanner.close();
    }
}