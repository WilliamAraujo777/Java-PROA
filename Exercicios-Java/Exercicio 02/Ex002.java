import java.util.*;
public class Ex002{
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bem vindo ao programa!\n");
		
		System.out.println("Insira um numero: ");
		int num = scanner.nextInt();
		
		System.out.println("Insira um numero: ");
		int num2 = scanner.nextInt();	
		
		System.out.println("Insira um numero: ");
		int num3 = scanner.nextInt();
		
		if(num > num2 && num > num3){
			System.out.println("O numero " + num + " eh maior!");
		}else if(num2 > num && num2 > num3){	
			System.out.println("O numero " + num2 + " eh maior!!");
		}else{
			System.out.println("O numero " + num3 + " eh maior!!");
		}		

		scanner.close();
	}
}