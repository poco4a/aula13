package aula12prog3;

import java.util.Scanner;

public class TratamentoExcecao3 {

	/*
	 * TODO: 3) Insira o denominador com o valor 0 (zero)
	 */
	public static int divisor(int a, int b)
			throws MinhaExcecao {
		
			if(b == 0)
				//throw new MinhaExcecao("Divisão por Zero");
				throw new MinhaExcecao();
			else
				return a/b;
	}
	
	public static void main(String[] args) {
		
		/*
		 * TODO: 3.1) Insira o denominador com o valor 0 (zero)
		 */
		Scanner obj = new Scanner(System.in);
		System.out.print("\nDigite o numerador: ");
		int numerador = obj.nextInt();
		System.out.print("\nDigite o denominador: ");
		int denominador = obj.nextInt();
		//Aritmetica de inteiros: nao eh permitida divisao por zero
		int resultado=0;		
		try{
			/*
			 * TODO: 3.2) Invocou o metodo que dispara a excecao personalizada
			 */
			resultado = divisor(numerador,denominador);
		} catch (MinhaExcecao e){
			System.out.println("Excecao 3:" + e.getMessage());
			//e.printStackTrace();
		}
		//double resultado = (double) numerador / denominador;
		System.out.println("\nResultado: " + resultado);

	}

}
