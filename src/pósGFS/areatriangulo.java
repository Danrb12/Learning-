package pósGFS;

import java.util.Scanner;

public class areatriangulo {

	public static void main(String[] args) {
		
		Float  num1, num2, total;
		
		System.out.println("Insira valor 1:");
		Scanner entrada = new Scanner(System.in);
		 
		num1 = Float.parseFloat(entrada.next());
		
		System.out.println("insira valor 2:");
		num2 = Float.parseFloat(entrada.next());
		
		total = num1 * num2 / 2;
				
			System.out.println("a área do triângulo é:" + total);
	}

}
