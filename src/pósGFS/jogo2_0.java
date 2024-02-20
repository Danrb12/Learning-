package pósGFS;

import java.util.Random;
import java.util.Scanner;

public class jogo2_0{

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escolha a dificuldade do jogo");
		System.out.println("1 - fácil");
		System.out.println("2 - médio");
		System.out.println("3 - difícil");

		int numero = entrada.nextInt();
		
		switch (numero){
		   case 1: 
			Random gerador = new Random();
			int x = gerador.nextInt(10);
			
			Scanner entrada1 = new Scanner(System.in);
			System.out.println("Adivinhe o numero em que estou pensando");
			 int numero1 = entrada1.nextInt();
			 
			 if (numero1 == x){ 
				 System.out.println("Parabéns, você acertou!");
			 }
			 else{
				 System.out.println("Você errou, pensei no:" + x);
			 } 
			 break;
		  case 2: 
			  Random gerador1 = new Random();
		        int numero2 = gerador1.nextInt(50);

		        Scanner entrada2 = new Scanner(System.in);
		        System.out.println("Adivinhe o numero em que estou pensando");
		         int inteiro = entrada2.nextInt();

		         if (inteiro == numero2){ 
		           System.out.println("Parabéns, você acertou!");
		         }
		         else{
		           System.out.println("Você errou, pensei no:" + numero2);
		        break;}
		  case 3: 
			  Random gerador3 = new Random();
		  		int xx = gerador3.nextInt(100);

          Scanner entrada3 = new Scanner(System.in);
          System.out.println("Adivinhe o numero em que estou pensando");
          int z = entrada3.nextInt();

          if (z == xx) {
              System.out.println("Parabéns, você acertou!");
          } else {
              System.out.println("Você errou, pensei no:" + xx);
          }
          break;
		
		default:
          System.out.println("Opção inválida.");	
          	}
		}
	}


