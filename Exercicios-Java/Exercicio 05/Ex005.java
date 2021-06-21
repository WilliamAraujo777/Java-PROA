import java.util.*;
public class Ex005{
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bem vindo ao programa!\n");
		
		System.out.println("Digite um numero: ");
		int num = scanner.nextInt();
		
		System.out.println("Digite um numero: ");
		int num2 = scanner.nextInt();
		
		if(num > 0 && num2 > 0){
			System.out.println("Positivo! Os dois são positivos!");
		}else if(num < 0 && num2 < 0){
			System.out.println("Positivo! Os dois são negativos!");
		}else{
			System.out.println("Negativo!");
		}
		
		scanner.close();		
			
	}
	
	
	
}