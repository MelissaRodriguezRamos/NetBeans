/*Melissa Rodriguez Ramos
*Practica 1
*El proposito de esta practica es realizar la operacion de una suma de dos numeros
*31-10-2023
*/
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;
import java.io.*;
/**
 *
 * @author Melissa Rdz
 */
public class Practica1 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int num1;
		int num2;
		int suma;
		System.out.println("Ingresa el primer numero a sumar");
		num1 = Integer.parseInt(bufEntrada.readLine());
		System.out.println("Ingresa el segundo numero a sumar");
		num2 = Integer.parseInt(bufEntrada.readLine());
		suma = num1+num2;
		System.out.println("La suma de los valores es de: "+suma);
	}


}