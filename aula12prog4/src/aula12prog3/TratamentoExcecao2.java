package aula12prog3;

import java.util.Scanner;

public class TratamentoExcecao2 {

	/*
	 * TODO: 2) Metodo que dispara uma excecao
	 */
	public static int divisor(int a, int b)
	   throws ArithmeticException {
		return a/b;
	}

	public static void main(String[] args) {
		
		/*
		 * TODO: 1) Insira o denominador com o valor 0 (zero)
		 */
		Scanner obj = new Scanner(System.in);
		System.out.print("\nDigite o numerador: ");
		int numerador = obj.nextInt();
		System.out.print("\nDigite o denominador: ");
		int denominador = obj.nextInt();
		//Aritmetica de inteiros: nao eh permitida divisao por zero
		int resultado=0;		
		try{
			resultado = numerador / denominador;
		} catch (ArithmeticException e){
			System.out.println("Excecao 1");
			e.printStackTrace();
		}
		//double resultado = (double) numerador / denominador;
		System.out.println("\nResultado: " + resultado);
		
		/*
		 * TODO: 2) Metodo que dispara uma excecao
		 */
		try {
			resultado = divisor(numerador,denominador);
		} catch (ArithmeticException e){
			System.out.println("Excecao 2");
			e.printStackTrace();
		}
		System.out.println("\nResultado: " + resultado);

	}

}
