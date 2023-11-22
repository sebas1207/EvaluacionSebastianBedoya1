package Main;

import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	}

}
class modeloMatriz {
	private int[][] matriz;

	public modeloMatriz() {
		this.matriz = new int[5][5];
	}

	public int[][] getMatriz() {
		return matriz;
	}

	public void ingresarValores(int numero, int fila, int columna) {
		if (fila >= 0 && fila < 5 && columna >= 0 && columna < 5) {
			matriz[fila][columna] = numero;
		} else {
			System.out.println("ingresar valores dentro del rango de la matriz 5x5");
		}
	}
}

class matrizVista {

	public void imprimirMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.println(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void  secuencia(int[] secuencia) {
		for (int valor : secuencia) {
			System.out.println(valor + " ");
		}
		System.out.println();
	}

}


class matrizControlador{
	
	private modeloMatriz modelo;
	private matrizVista vista;
	public matrizControlador(modeloMatriz modelo,matrizVista vista) {
		this.modelo=modelo;
		this.vista=vista;
	}
	public void metodo(int numero, int fila, int columna) {
		modelo.ingresarValores(numero, fila, columna);
		
		
	}
}


