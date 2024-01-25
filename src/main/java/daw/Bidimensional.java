/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package daw;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author khalid
 */
public class Bidimensional {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario el número de filas y columnas
        System.out.print("Introduce el número de filas: ");
        int filas = scanner.nextInt();

        System.out.print("Introduce el número de columnas: ");
        int columnas = scanner.nextInt();

        // Crear la matriz con los tamaños proporcionados
        int[][] matriz = new int[filas][columnas];

        // Rellenar la matriz pidiendo al usuario los valores
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Introduce el valor para la posición [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Mostrar la matriz completa
        System.out.println("Matriz completa:");
        mostrarMatriz(matriz);

        // Calcular la suma de los elementos de la matriz
        int suma = calcularSuma(matriz);

        // Mostrar la suma de los elementos
        System.out.println("La suma de los elementos de la matriz es: " + suma);
        
        mostrarNumeroColumnas(matriz);
        mostrarColumnas(matriz);
    }

    // Método para mostrar la matriz
    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Método para calcular la suma de los elementos de la matriz
    public static int calcularSuma(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }
        return suma;
    }
    
    
    public int calcularSumaFilas(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }
        return suma;
    }
    
    
    public int calcularSumaColumnas(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }
        return suma;
    }
    
    // Método para mostrar solo las columnas de la matriz
    private static void mostrarColumnas(int[][] matriz) {
        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = 0; i < matriz.length; i++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Método para mostrar el número de columnas de la matriz
    private static void mostrarNumeroColumnas(int[][] matriz) {
        System.out.println("Número de columnas de la matriz: " + matriz[0].length);
    }
    
    
    
    
    
}



//para el jueves un metodo que devuelva las sumas de columnas y otro que lo demuestra en filas

//En una clase con el main, usando métodos de clase a) Método que recibe un número "n" entre 1 y 10 y devuelve una matriz de nXn elementos aleatorios de tipo char. 
//b) Método que recibe la matriz y un char y devuelve una lista de objetos Celda indicando las casillas donde se encuentra ese char dentro de la matriz.