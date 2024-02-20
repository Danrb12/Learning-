package pósGFS;
import java.util.Scanner;
import java.util.Random;
public class Jogorandom {

	public static void main(String[] args) {
		Random gerador = new Random();
		int x = gerador.nextInt(100);
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Adivinhe o numero em que estou pensando");
		 int numero = entrada.nextInt();
		 
		 if (numero == x){ 
			 System.out.println("Parabéns, você acertou!");
		 }
		 else{
			 System.out.println("Você errou, pensei no:" + x);
		 }														
			 
			 
			}
		 
		 
		 
				 
		
		
		
		

	}


