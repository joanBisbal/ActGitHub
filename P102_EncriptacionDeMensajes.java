import java.util.Scanner;

public class P102_EncriptacionDeMensajes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String cadena;
		String cadenaCifrada = "";
		int desplazamiento;
		int cont = 0;

		do {

			cadena = sc.nextLine();

			// Primero sacar el desplazamiento
			desplazamiento = obtieneDesplazamiento(cadena);

			// Ahora codificamos
			cadenaCifrada = cifraCadenaConXDesplazamiento(cadena, desplazamiento);

			// Contar vocales sin tilde
			if (!cadenaCifrada.equals("FIN")) {

				cont = cuentaVocalesDelString(cadenaCifrada);
				System.out.println(cont);

			}

		} while (!cadenaCifrada.equals("FIN"));

		sc.close();

	}

	public static int obtieneDesplazamiento(String cadena) {
		return ('p' - cadena.charAt(0));
	}

	public static int cuentaVocalesDelString(String cadena) {

		String vocales = "AEIOUaeiou";
		char caracter;
		int cont = 0;

		for (int i = 0; i < cadena.length(); i++) {

			caracter = cadena.charAt(i);

			if (vocales.indexOf(caracter) != -1) {
				cont++;
			}

		}

		return cont;

	}

	public static String cifraCadenaConXDesplazamiento(String cadena, int desplazamiento) {

		String letrasMayus = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String letrasMinus = "abcdefghijklmnopqrstuvwxyz";
		String cadenaCifrada = "";
		char caracter;
		char caracterCifrado;
		int asciMin;
		int asciMayus;

		for (int i = 1; i < cadena.length(); i++) {

			caracter = cadena.charAt(i);

			if (letrasMayus.indexOf(caracter) != -1) {

				asciMayus = caracter + desplazamiento;

				if ((asciMayus > 90) || (asciMayus < 65)) {

					if (asciMayus > 90) {
						asciMayus -= 26;
					}

					if (asciMayus < 65) {
						asciMayus += 26;
					}

					caracterCifrado = (char) (asciMayus);

				} else {
					caracterCifrado = (char) (asciMayus);

				}

				cadenaCifrada += caracterCifrado;

			} else if (letrasMinus.indexOf(caracter) != -1) {

				asciMin = caracter + desplazamiento;

				if ((asciMin > 122) || (asciMin < 97)) {

					if (asciMin > 122) {
						asciMin -= 26;
					}

					if ((asciMin < 97)) {
						asciMin += 26;
					}

					caracterCifrado = (char) (asciMin);

				} else {
					caracterCifrado = (char) (asciMin);
				}

				cadenaCifrada += caracterCifrado;

			} else {

				cadenaCifrada += cadena.charAt(i);

			}

		}

		return cadenaCifrada;

	}

}
