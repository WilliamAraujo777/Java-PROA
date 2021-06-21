import javax.swing.JOptionPane;

public class Ex003{
	
	public static void main(String[] args){

		int soma = 0;
		
		
		JOptionPane.showMessageDialog(null, "Bem vindo ao programa!");
				
		int num = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero: "));

		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero: "));
			 		
		int num3 = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero: "));
		
		if(num < num2 && num < num3){
			soma = num2 + num3;
			JOptionPane.showMessageDialog(null,"O soma dos maiores valores eh de " + soma);
		}else if(num2 < num && num2 < num3){	
			soma = num + num3;
			JOptionPane.showMessageDialog(null,"O soma dos maiores valores eh de " + soma);
		}
		
		else{
			soma = num + num2;
			JOptionPane.showMessageDialog(null,"O soma dos maiores valores eh de " + soma);
		}
		
			
			
	}
	
	
	
}