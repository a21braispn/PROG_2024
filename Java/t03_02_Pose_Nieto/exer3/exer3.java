package exer3;

import java.util.Scanner;

public class exer3 {
    public static void main(String[] args) throws Exception {
        // Inicializamos a entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Pedimos o numero de columnas
        System.out.print("Indica o número de columnas: ");
        int columnas = scanner.nextInt();
        
        // Pedimos o numero de filas
        System.out.print("Indica o número de filas: ");
        int filas = scanner.nextInt();

        //Inicializamos a matriz
        int[][] matriz = new int[columnas][filas];
        
        // Recorremos cada columna
        for(int c=0; c< matriz.length; c++){

            // Agora collemos cada columna para recorrer a súa respectiva fila
            for(int f=0; f< matriz[c].length; f++){
                // Introducimos o seu valor
                System.out.println("Introduce a valor da columna " + c + " e fila " + f + " :");
                int valor = scanner.nextInt();
                matriz[c][f] = valor;
            }
        }

        // Recorremos cada columna para imprimir cada fila
        for(int c=0; c < matriz.length; c++){
            // Agora recorremos cada valor da columna
            int suma = 0;
            for(int f=0; f < matriz[c].length; f++){
                suma = suma + matriz[c][f];
            }
            System.out.println(suma);
        }

        // Almacenamos nun vector as sumas das filas
        int[] sumaFilas = new int[filas];

        // Recorremos cada columna para imprimir cada fila
        for(int c=0; c < matriz.length; c++){
            
            // Agora recorremos cada fila e gardamos o valor de cada unha delas no seu respectivo vector
            for(int f=0; f < matriz[c].length; f++){
                sumaFilas[f] = sumaFilas[f] + matriz[c][f];
            }
        }

        // Imprimimos os valores das sumas das filas
        for(int suma: suma_Filas){
            System.out.println(suma);
        }
        
        // Cerramos a entrada de datos
        scanner.close();
    }
}