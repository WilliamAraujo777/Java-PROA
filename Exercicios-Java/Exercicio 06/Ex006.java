import java.util.*;
public class Ex006{
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int soma = 0;
		int num = 0;
		
		System.out.println("Bem vindo ao programa!\n");
		
		for(int cont = 1; cont < 11; cont++){
		
			System.out.println("Insira o numero de posicao " + cont + ":");
			num = scanner.nextInt();
			
			soma += num;
		
		}
		
		System.out.println("A soma dos 10 numeros e de: " + soma);
		
		scanner.close();		
			
	}
	
	
	
}