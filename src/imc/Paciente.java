package imc;
import java.util.Scanner; 

public class Paciente {
	
	//atributos
	double kg;
	double altura; 
	double fimc;
	
	//construtores 
	Paciente (double kg, double altura, double fimc){
		
		this.kg = kg;
		this.altura = altura;
		this.fimc = fimc;
	}
	
	public Paciente() {
		Scanner scanner = new Scanner(System.in); 
		
		System.out.println("Digite seu peso em kg:");
		this.kg = scanner.nextDouble();
		
		System.out.println("Digite sua altura em Metros:");
		this.altura = scanner.nextDouble();
		
		fimc = kg / (altura * altura);
		
		
		if (fimc <= 16 ) {
			System.out.printf("IMC = %.2f Baixo peso muito grave.%n", fimc);
		} else if ( fimc >= 16 && fimc <= 16.99){
			System.out.printf("IMC = %.2f Baixo peso grave.%n", fimc);
		} else if ( fimc >= 17 && fimc <= 18.49){
	 		System.out.printf("IMC = %.2f Baixo peso.%n", fimc);
		} else if ( fimc >= 18.50 && fimc <= 24.99){
			System.out.printf("IMC = %.2f Peso normal.%n", fimc);
		} else if (fimc >= 25 && fimc <= 29.99){
			System.out.printf("IMC = %.2f Sobrepeso.%n", fimc);
		} else if ( fimc >= 30 && fimc <= 34.99){
			System.out.printf("IMC = %.2f Obesidade grau 1.%n", fimc);
		} else if (fimc >= 35 && fimc <= 39.99){
			System.out.printf("IMC = %.2f Obesidade grau 2.%n", fimc);	
		} else {
			System.out.printf("IMC = %.2f Obesidade mórbida.%n", fimc);
		}
			
		scanner.close();
		
		}
		}
