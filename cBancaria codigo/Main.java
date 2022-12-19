package cuentaBancariaISO2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner escaner = new Scanner(System.in);
		Boolean independiente = null;
		Boolean estudiante = null;
		int edad = -1;

		while (edad < 0 || edad > 120) {
			System.out.println("Introduzca la edad del cliente entre 0 y 120");
			try {
				edad = escaner.nextInt();
			} catch (Exception e) {
				System.out.println("Valor numerico entero no detectado.");
				// Limpiar el escaner para que no haga un bucle continuo de excepción.
				escaner.nextLine();

			}
		}
		while (estudiante == null) {
			System.out.println("Introduzca si el cliente es estudiante (true) o trabaja (false).");
			try {
				estudiante = escaner.nextBoolean();
			} catch (Exception e) {
				System.out.println("Valor booleano no detectado.");
				// Limpiar el escaner para que no haga un bucle continuo de excepción.
				escaner.nextLine();

			}
		}
		while (independiente == null) {
			System.out.println(
					"Introduzca si el cliente es independiente (true) o reside en el domicilio de sus padres (false).");
			try {
				independiente = escaner.nextBoolean();
			} catch (Exception e) {
				System.out.println("Valor booleano no detectado.");
				// Limpiar el escaner para que no haga un bucle continuo de excepción.
				escaner.nextLine();

			}
		}
		Cliente c1 = new Cliente(edad, estudiante, independiente);

		if (c1.getEdad() < 18 && c1.isEstudiante() && !c1.isIndependiente()) {
			System.out.println("La cuenta ideal para este cliente es la 'Cuenta Confort'");

		} else if (edad < 25 && edad >= 18) {

			if (c1.isEstudiante() && c1.isIndependiente())
				System.out.println("La cuenta ideal para este cliente es la 'Cuenta Vamos que tú puedes'");

			else if (!c1.isEstudiante() && !c1.isIndependiente())
				System.out.println("La cuenta ideal para este cliente es la 'Cuenta Ahorra ahora que puedes'");

			else if (!c1.isEstudiante() && c1.isIndependiente())
				System.out.println("La cuenta ideal para este cliente es la 'Cuenta Saltando del Nido'");

		} else if (edad >= 25) {

			if (!c1.isEstudiante() && !c1.isIndependiente())
				System.out.println("La cuenta ideal para este cliente es la 'Cuenta Independizate que va siendo hora'");

			else if (c1.isEstudiante() && c1.isIndependiente())
				System.out.println("La cuenta ideal para este cliente es la 'Cuenta Bienvenido a la Vida Adulta'");

		} else
			System.out.println("No se le puede ofrecer una tipo de cuenta de acuerdo a sus necesidades");
	}

}
