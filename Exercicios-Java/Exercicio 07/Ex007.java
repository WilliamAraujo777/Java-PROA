import java.util.*;
public class Ex007{
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int num[] = new int[11];
		int soma = 0;
				
		System.out.println("Bem vindo ao programa!\n");
			
		for(int cont = 1; cont < 11; cont++){
			System.out.println("Digite um numero: ");
			
			num[cont] = scanner.nextInt();
			
			if(num[cont] < 40){
					soma = soma + num[cont];
			}
		}
	
		System.out.println("A soma dos 10 numeros menores que 40 e de: " + soma);
		
		scanner.close();				
	}
}