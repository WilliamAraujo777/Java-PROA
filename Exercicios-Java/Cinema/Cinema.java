
import java.util.*;

public class Cinema {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> lugares = new ArrayList<String>();
		int sala = 0;
		int escolha = 0;
		int qtdLugares = 0;
		int escolhaQTD = 0;
		String lugarEscolhido = "";
		System.out.println("Olá! Seja bem vindo(a) a bilheteria!\nPor favor, insira seu nome: ");
		String nome = sc.nextLine();
		
		while (escolha == 0) {
			System.out.println("Atualmente, estamos com duas salas de cinema ativas, qual deseja?"
					+ "\n1 para Sala Alpha = As Branquelas" + "\n2 para Sala Beta  = A chegada");
			sala = sc.nextInt();

			if (sala == 1 || sala == 2) {
				escolha += 1;
			} else {
				System.out.println("Opa! Parece que selecionou uma sala indisponivel...Tente novamente!");
			}
		}

		while (escolhaQTD == 0) {
			if (sala == 1) {
				System.out.println(
						"Você Selecionou a sala Alpha com o filme: As Branquelas! Que contem 140 lugares disponiveis!"
								+ "\nQuantos lugares vai querer?");
				qtdLugares = sc.nextInt();
				if (qtdLugares > 0 && qtdLugares <= 140) {
					escolhaQTD += 1;
				} else {
					System.out.println("Por favor, selecione no máximo 140 bilhetes!");
				}

			} else if (sala == 2) {
				System.out.println(
						"Você Selecionou a sala Beta com o filme: A chegada! Que contem 120 lugares disponiveis!"
								+ "\nQuantos lugares vai querer?");
				qtdLugares = sc.nextInt();
				if (qtdLugares > 0 && qtdLugares <= 120) {
					escolhaQTD += 1;
				} else {
					System.out.println("Por favor, selecione no máximo 120 bilhetes!");
				}
			}
		}

		for (int cont = 0; cont < qtdLugares; cont++) {

			if (sala == 1) {
				System.out.println("Qual fileira irá querer?" + "\nF " + "\nE " + "\nD" + "\nC" + "\nB"
						+ "\nA - ASSENTOS PREFERENCIAIS" + "\nTELAO");
				char fileiraEscolhida = sc.next().charAt(0);
				sc.nextLine();
				fileiraEscolhida = Character.toLowerCase(fileiraEscolhida);

				if (fileiraEscolhida != 'a') {
					System.out.println("Agora escolha um assento: "
							+ "\n1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 ");
					lugarEscolhido = fileiraEscolhida + sc.nextLine();

				} else {
					System.out.println("Agora escolha um assento: " + "\n1 2 3 4 5 6 7 8 9 10 11 12 13"
							+ "\nPREFERENCIAIS: 14 15 16 17 18 19 20 21 22 23 24 25");
					lugarEscolhido = fileiraEscolhida + sc.nextLine();
				}

		
			} else if (sala == 2){

				System.out.println("Qual fileira irá querer?" + "\nE " + "\nD" + "\nC" + "\nB"
						+ "\nA - ASSENTOS PREFERENCIAIS" + "\nTELAO");
				char fileiraEscolhida = sc.next().charAt(0);
				fileiraEscolhida = Character.toLowerCase(fileiraEscolhida);

				if (fileiraEscolhida != 'a') {
					sc.nextLine();
					System.out.println("Agora escolha um assento: "
							+ "\n1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24");
					lugarEscolhido = fileiraEscolhida + sc.nextLine();

				} else {
					sc.nextLine();
					System.out.println("Agora escolha um assento: " + "\n1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18"
							+ "\nPREFERENCIAIS: 19 20 21 22 23 24 ");
					lugarEscolhido = fileiraEscolhida + sc.nextLine();
				}
			}

			if (cont != 0) {
				if (!lugares.contains(lugarEscolhido)) {
					lugares.add(cont, lugarEscolhido);
				} else {
					System.out.println("Opa! Parece que este lugar ja foi selecionado! Por favor, escolha outro");
					cont -= 1;
				}
			} else {
				lugares.add(cont, lugarEscolhido);
			}
		}
		System.out.println(
				nome + " seus ingressos foram comprados com sucesso. Aproveite a pipoca grátis e tenha um bom filme.");
		sc.close();

	}

}

/*
 * a b c d e f g h i j k l m n o p q r s t u v w beta a b c d e f g h i j k l m
 * n o p q r s t alpha
 */

/*
 * A sala Alpha possui 140 lugares divididos em 6 fileiras (A, B, C, D, E, F)
 * com mais 12 assentos para pessoas com deficiência. A sala Beta possui 120
 * lugares divididos em 5 fileiras (A, B, C, D, E) com mais 6 lugares para
 * pessoas com deficiência.
 * 
 * 
 * 
 * Haverá uma sessão na Sala Alpha de "As Branquelas" e outra sessão na Sala
 * Beta de "A Chegada".
 * 
 * 
 * 
 * Construa um programa em que uma pessoa compre um ingresso para qualquer uma
 * das salas e possa escolher a fileira em que vai sentar.
 * 
 * 
 * 
 * O programa deve perguntar, em algum momento, o nome do usuário.
 * 
 * 
 * 
 * Uma vez que o assento seja escolhido, é necessário que o programa exiba
 * quantos lugares ainda estão disponíveis no total e também em quais fileiras.
 * 
 * 
 * 
 * É importante que o comprador possa escolher a quantidade de ingressos que
 * quer comprar e que ele não possa comprar mais ingressos do que a fileira
 * tenha disponível.
 * 
 * 
 * 
 * Ao final, o programa deve exibir a mensagem
 * "[COMPRADOR], seus ingressos foram comprados com sucesso. Aproveite a pipoca grátis e tenha um bom filme."
 * .
 */