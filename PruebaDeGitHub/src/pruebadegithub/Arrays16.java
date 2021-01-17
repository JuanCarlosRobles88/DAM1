package pruebadegithub;

import java.io.IOException;

import java.util.Scanner;

public class Arrays16 {

	public static void main(String[] Args) throws IOException {

		Scanner lector = new Scanner(System.in);

		int cantidad, i, j;

		boolean si = true;

		System.out.println("Intruduzca el tamaño de la palabra");

		cantidad = lector.nextInt();

		char palabra[] = new char[cantidad];

		System.out.println("Introduzca una palabra");

		for (int letra = 0; letra < palabra.length; letra++) {
			palabra[letra] = (char) System.in.read();
		}

		lector.close();

		for (i = 0, j = palabra.length - 1; i < j; i++, j--) {
			if (palabra[i] == palabra[j]) {
				si = true;
			} else {
				si = false;
			}
		}

		if (si == true) {
			System.out.print("Palíndromo:" + si);
		} else {
			System.out.print("Palíndromo:" + si);
		}
	}
}
