package pósGFS;
import java.util.Scanner;

public class ano_bissexto {

	public static void main(String[] args) {
		Scanner entrada1 = new Scanner(System.in);
		do {
	    System.out.println("Digite um ano para saber se é bissexto:");
	    int ano = entrada1.nextInt();
	      if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {

	    System.out.println(" O Ano " + ano + " é Bissexto");
	        }

	     else {

	      System.out.println(" O ano " + ano +  "não é bissexto");	   
	     } 
	      System.out.println("Deseja verificar outro ano? Digite sim para continuar");
		} while (entrada1.next().equalsIgnoreCase("sim"));
	       
	}

}
