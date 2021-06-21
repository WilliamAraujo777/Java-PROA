import java.util.*;
public class Ex004{
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		double soma = 0;
		int operacao = 0;
		int opcao = 1;
		
			
		System.out.println("Bem vindo ao programa!\n");
		
		while(opcao == 1){
			
			
		System.out.println("Insira um numero: ");
		double num = scanner.nextDouble();
		
		System.out.println("Insira um numero: ");
		double num2 = scanner.nextDouble();	
		
		System.out.println("Qual operacao deseja realizar: "
		+"\n1 = +"
		+"\n2 = -"
		+"\n3 = *"
		+"\n4 = /");
		
		operacao = scanner.nextInt();
		
		if(operacao == 1){
			soma = num + num2;
			System.out.println("O soma dos valores eh de " + soma);
		}else if(operacao == 2){	
			soma = num - num2;
			System.out.println("O subtracao dos valores eh de " + soma);
		}else if(operacao == 3){	
			soma = num * num2;
			System.out.println("O multiplicacao dos valores eh de " + soma);
		}else if(operacao == 4){	
			soma = num / num2;
			System.out.println("O divisao dos valores eh de " + soma);
		}else{
			System.out.println("OPERACAO INVALIDA");	
		}
		
		System.out.println("Deseja continuar?"
		+"\n Insira 1 para continuar a operar"
		+"\n Insira qualquer outro numero para finalizar");
		opcao = scanner.nextInt();
		
		if(opcao > 1)
		{
			System.out.println("Finalizando programa!\n");
			scanner.close();
		}
				
			
	}
	
	
	}
}