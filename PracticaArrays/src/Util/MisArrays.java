package Util;

import java.util.Arrays;

public class MisArrays {
	/**
	 * Esto es un metodo que te devuelve la media de una array, con numeros del 1 al 10
	 * @param notas
	 * @return devuelve un int que es la media de todos los numeros dentro de la array
	 */
	public static int media(int[] notas) {
        int suma = 0;
        for (int nota : notas) {
            if (nota < 0 || nota > 10) {
                throw new IllegalArgumentException("La nota debe estar entre 0 y 10");
            }
            suma += nota;
        }
        return (int) suma / notas.length;
    }
	
	
	/**
	 * Esto es un metodo que devuelve la mediana de una array con numeros del 1 al 10 
	 * @param notas
	 * @return devuelve un int que es la mediana de numeros comprendidos en una array
	 */
	
	  public static int mediana(int[] notas) {
	        Arrays.sort(notas);
	        if (notas.length % 2 == 0)
	            return ((int) notas[notas.length / 2 - 1] + (int) notas[notas.length / 2]) / 2;
	        else
	            return (int) notas[notas.length / 2];
	    }
	  /**
	   * Esto es un metodo que te devuelve el numero mayor de una array
	   * @param notas
	   * @return devuelve un int que es la mayor nota de la clase 
	   */
	  public static int maxima(int[] notas) {
	        int max = notas[0];
	        for (int nota : notas) {
	            if (nota > max) {
	                max = nota;
	            }
	        }
	        return max;
	    }
	  /**
	   * Esto es un metodo que devuelve el numero menor dentro de una array
	   * @param notas
	   * @return devuelve un int con el menor numero de una array
	   */
	  public static int minima(int[] notas) {
	        int min = notas[0];
	        for (int nota : notas) {
	            if (nota < min) {
	                min = nota;
	            }
	        }
	        return min;
	    }
}
