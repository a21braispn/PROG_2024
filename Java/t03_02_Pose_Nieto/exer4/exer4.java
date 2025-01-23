package exer4;

import java.util.Scanner;

public class exer4 {
    public static void main(String[] args) throws Exception {
        // Inicializamos a entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Pedimos o numero de estudiantes
        System.out.print("Indica o número de estudiantes: ");
        int estudiantes = scanner.nextInt();

        // Pedimos o numero de modulos
        System.out.print("Indica o número de modulos: ");
        int modulos = scanner.nextInt();

        // Inicializamos a matriz
        int[][] matriz = new int[estudiantes][modulos];

        for(int e=0; e< matriz.length; e++){

            for(int m=0; m< matriz[e].length; m++){
                System.out.print("Introduce a nota do estudiante " + e + " no modulo " + m + " : ");
                int valor = scanner.nextInt();
                matriz[e][m] = valor;
            }
        }
       String opcion;
        do {
            System.out.println("a) Media dun alumno/a");
            System.out.println("b) Porcentaxe de aprobados");
            System.out.println("c) Salir");
            System.out.print("Selecciona unha opción: ");
            opcion = scanner.nextLine();
            switch (opcion) {
                case "a":
                    System.out.print("Introduce o alumno a facer a media: ");
                    int alumno = scanner.nextInt();
                    for(int m=0; m < matriz[alumno].length; m++){
                        sumaFilas[m] = sumaFilas[m] + matriz[e][m];
                    }
                    break;
                case "b":
                    System.out.print("Introduce o módulo do que se fará a media: ");
                    break;
                case "c":
                    System.out.println("------> Saíndo");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intenta de nuevo.");
            }   
            System.out.println();
        }while (opcion != "c");

        scanner.close();
    }
}
