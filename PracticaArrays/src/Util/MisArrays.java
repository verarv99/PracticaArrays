package Util;

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
}
