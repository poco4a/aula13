package aula12prog3;

import java.util.Scanner;

public class TratamentoExcecao1 {

	public TratamentoExcecao1() {
		
	}

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.print("\nDigite o numerador: ");
		int numerador = obj.nextInt();
		System.out.print("\nDigite o denominador: ");
		int denominador = obj.nextInt();
		//Aritmetica de inteiros: nao eh permitida divisao por zero
		int resultado = numerador / denominador;
		//double resultado = (double) numerador / denominador;
		System.out.println("\nResultado: " + resultado);

	}

}
