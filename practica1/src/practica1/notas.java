package practica1;

import java.util.Scanner;

/**
 * Clase para la entrada de notas de un estudiante y realizar calculos para
 * determinar su nota definitiva.
 * 
 * @author Carlos Valles - Roberto Garcia
 * @version 1.0
 * @since 2025
 */

public class notas {

	/** Nota unidad formativa 4 */
	double uf4;
	/** Nota unidad formativa 5 */
	double uf5;
	/** Nota unidad formativa 6 */
	double uf6;
	/** Acumulado unidad formativa 4 */
	double acu4;
	/** Acumulado unidad formativa 5 */
	double acu5;
	/** Acumulado unidad formativa 6 */
	double acu6;
	/** Nota definitiva estudiante */
	double def;

	/** Objeto Scanner para la entrada de datos */

	Scanner entrada = new Scanner(System.in);

	/**
	 * Metodo para introducir notas del estudiante.
	 */
	public void IngresaNotas() {

		System.out.println("ingrese las notas del estudiante");

		System.out.print("ingrese nota 1: ");

		uf4 = entrada.nextDouble();

		System.out.print("ingrese nota 2: ");

		uf5 = entrada.nextDouble();
		System.out.print("ingrese nota 3: ");

		uf6 = entrada.nextDouble();

	}

	/**
	 * Metodo para comprobar si las notas introducidas son correctas.
	 */

	public void comprobarcion() {

		if (uf4 > 10) {
			System.out.println(" nota1 mal introducida");

		} else {
			System.out.println(" nota1 correcta");
		}

		if (uf5 > 10) {
			System.out.println(" nota2 mal introducida");

		} else {
			System.out.println(" nota2 correcta");
		}
		if (uf6 > 10) {
			System.out.println(" nota3 mal introducida");

		} else {
			System.out.println(" nota3 correcta");
		}

	}

	/**
	 * Metodo para el calculo de la nota definitiva del estudiante.
	 */

	public void Calculonotas() {
		acu4 = uf4 * 0.35;
		acu5 = uf5 * 0.35;
		acu6 = uf6 * 0.30;

		def = acu4 + acu5 + acu6;

	}
	
	/**
	 * Metodo para mostrar las notas introducidas y los calculos.
	 */

	public void Mostrar() {
		
		System.out.println(" notas introducidas son:");
		System.out.println(" nota1 = " + uf4);
		System.out.println(" nota2 = " + uf5);
		System.out.println(" nota3 = " + uf6);

		System.out.println(" acumuado 1 = " + acu4);
		System.out.println(" acumuado 2 = " + acu5);
		System.out.println(" acumuado 3 = " + acu6);

		System.out.println(" nota definitiva es = " + def);

	}

	/**
	 * Metodo para comprobar si el estudiante ha suspendido o aprobado.
	 */

	public void aprobado() {

		if (def < 5 && def >= 0) {
			System.out.println("suspendio");
		} else {
			if (def >= 5 && def <= 10) {
				System.out.println("aprobado");
			} else {
				System.out.println(" error en la notas");
			}
		}
	}

	/**
	 * Metodo para ejecutar el flujo del programa.
	 * 
	 * @param args Argumentos de línea de comandos.
	 */

	public static void main(String[] args) {

		notas fc = new notas();

		fc.IngresaNotas();

		fc.comprobarcion();

		fc.Calculonotas();

		fc.Mostrar();

		fc.aprobado();

	}

}