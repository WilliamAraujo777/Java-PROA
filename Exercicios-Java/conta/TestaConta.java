import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;

public class TestaConta {

    public static void main(String[] args) {

        SimpleDateFormat formatadorData = new SimpleDateFormat("dd/MM/yyyy");
        DecimalFormat formatadorValor = new DecimalFormat("0.00");

        int agencia = 0;
        boolean continua = true;
        int numeroConta = 0;
        int tentativa = 3;
        int opcao = 0;

        Conta conta = new Conta("William Araujo", 777, 1234, 700.0, "17/07/2015");

        msgDefault("Boas vindas ao sistema do banco Will SA.!", "OLÁ!");

        // Laço de repetição responsável por verificar se a agência está correta
        while (continua) {
            // Esse try está ai para capturar caso o usuario digite uma letra ao invéz de um
            // numero
            try {
                agencia = msgInput("Digite sua agencia: ", "AGÊNCIA");
                if (conta.getAgencia() == agencia) {
                    msgDefault("Agência encontrada! Prossiga apertando em OK", "AGÊNCIA");
                    continua = false;
                } else {
                    tentativa -= 1;
                    if (tentativa < 1) {
                        msgErro("Conta bloqueada, não há mais tentativas restantes, contate o ADM!", "ERRO");
                        System.exit(0);
                    } else {
                        msgErro("Agencia incorreta! Digite novamente! " + "\nPS: Você tem " + tentativa
                                + " tentativa(s) restante(s)!", "ERRO");
                    }
                }

            } catch (NumberFormatException e) {                 // Este catch lança um Exception caso o usuario tenha coloca uma letra ao invéz
                msgErro("Por favor, apenas numeros!", "ERRO");  // de um numero,
            }                                                   // gerando uma mensagem e retornando para a opção de digitar a agência
        }
        continua = true;
        tentativa = 3;

        // Laço de repetição responsável por verificar se a conta está correta
        while (continua) {
            // Esse try está ai para capturar caso o usuario digite uma letra ao invéz de um
            // numero
            try {
                numeroConta = msgInput("Digite sua conta: ", "CONTA");
                System.out.println(numeroConta);
                if (conta.getNumero() == numeroConta) {
                    msgDefault("Numero da conta encontrado! Prossiga para os nossos serviços", "CONTA");
                    continua = false;
                } else {
                    tentativa -= 1;
                    if (tentativa < 1) {
                        msgErro("Conta bloqueada, não há mais tentativas restantes, contate o ADM!", "ERRO");
                        System.exit(0);
                    } else {
                        msgErro("Numero da conta incorreto! Digite novamente! " + "\nPS: Você tem " + tentativa
                                + " tentativa(s) restante(s)!", "ERRO");
                    }
                }

               
              
               
            } catch (NumberFormatException e) {                 // Este catch lança um Exception caso o usuario tenha coloca uma letra ao invéz
                msgErro("Por favor, apenas numeros!", "ERRO");  // de um numero,
            }                                                   // gerando uma mensagem e retornando para a opção de digitar a conta
        }
        continua = true;

        // Laço de repetição responsável pelo menu do programa, onde ele testa todas as
        // opções e também finaliza o programa
        while (continua) {

            // a variavel "opcao" está sendo responsável por capturar a opção escolhida pelo
            // usuario
            opcao = msgInput("Selecione a opção desejada: " + "\n 1 = Dados da conta" + "\n 2 = Depositar"
                    + "\n 3 = Sacar" + "\n 4 = Verificar rendimento da conta " + "\n 5 = Finalizar sistema ",
                    "MENU PRINCIPAL");

            // Esse try está ai para capturar caso o usuario digite uma letra ao invéz de um
            // numero
            try {

                // aqui está sendo aberto um switch da opção escolhida pelo usuario
                // anteriormente, cada opção equivale a uma funcionalidade
                switch (opcao) {

                    // primeira opção reponsável apenas por apresentar os dados da conta (Titular,
                    // Saldo e data de abertura)
                    case 1:
                        msgDefault(
                                "Nome do titular: " + conta.getNomeTitular() + "\nSaldo: R$ " + conta.getSaldo()
                                        + "\nData de abertura: " + formatadorData.format(conta.getData_abertura()),
                                "DADOS DA CONTA");
                        break;

                    //segunda opção responsável por realizar um depósito na conta do usuario, a mesma verifica se ele é maior que 0 para continuar
                    case 2:
                        double deposito = msgInput("Saldo atual: " + conta.getSaldo()
                                + "\nInsira a quantia que deseja depositar na conta:", "DEPOSITO");
                        if (deposito > 0) {
                            conta.setSaldo(conta.getSaldo() + deposito);
                            msgDefault("O deposito no valor de: " + deposito + " foi realizado com sucesso!"
                                    + "\nNovo saldo é de " + conta.getSaldo(), "DEPOSITO");
                        } else {
                            msgErro("Erro! Por favor, insira um valor válido!", "ERRO");
                        }
                        break;
                    
                    //terceira opção responsável por realizar um saque na conta do usuario, a mesma verifica se ele é maior que 0 para continuar
                    //também verifica se é menor que o saldo atual
                    case 3:
                        double saque = msgInput(
                                "Saldo atual: " + conta.getSaldo() + "\nInsira a quantia que deseja sacar da conta:",
                                "SAQUE");

                        if (saque > 0 && saque <= conta.getSaldo()) {
                            conta.setSaldo(conta.getSaldo() - saque);
                            msgDefault("O saque no valor de: " + saque + " foi realizado com sucesso!"
                                    + "\nNovo saldo é de " + conta.getSaldo(), "SAQUE");
                        } else if (conta.getSaldo() == 0) {
                            msgErro("Erro! Sua conta esta zerada, impossivel realizar o saque!", "ERRO");
                        } else if (saque > conta.getSaldo()) {
                            msgErro("Erro! você não possui este valor em conta, impossivel realizar o saque!", "ERRO");
                        } else {
                            msgErro("Erro! Por favor, insira um valor válido!", "ERRO");
                        }
                        break;

                    //quarta opção é reponsável por realizar um teste de rendimento na conta, o usuario insere uma quantidade de meses que deseja
                    //deixar o dinheiro rendendo, e o programa retorna a quantia que o saldo teria depois daquele período
                    case 4:
                        int meses = msgInput("O seu dinheiro está rendendo 0.5% ao mês no nosso banco!"
                                + "\n Deseja realizar um teste e verificar quanto ele irá render em X meses?"
                                + "\n Insira a quantidade de meses que deseja deixar rendendo: ", "RENDIMENTO");

                        double valorRendido = conta.calculaRendimento(meses);
                        double acrescimo = valorRendido - conta.getSaldo();

                        msgDefault("Sua conta em " + meses + " meses vai render R$ " + formatadorValor.format(acrescimo)
                                + " reais" + "\nFicaria um total de R$ " + formatadorValor.format(valorRendido)
                                + " reais", "RENDIMENTO");

                        break;
                    
                    //quinta opção, responsável por finalizar o sistema, ela pergunta se o usuario realmente deseja fazer tal ato
                    case 5:
                        int i = msgConfirmar("Você realmente deseja finalizar o sistema?", "ATENÇÃO");
                        if (i == JOptionPane.YES_OPTION) {
                            msgDefault("Obrigado por utilizar nossos serviços!" + "\nO sistema será finalizado."
                                    + "\nAté mais " + conta.getNomeTitular(), "SAIR");
                            System.exit(0);
                        } else {
                            break;
                        }
                    
                    //essa opção é para caso o usuario selecione uma opção que não condiz com as do menu, o que gera um erro e retorna ao menu
                    default:
                        msgErro("Opção inválida! Por favor, selecione uma opção entre 1 e 5!", "ERRO");
                }
            } catch (NumberFormatException e) {                     // Este catch lança um Exception caso o usuario tenha coloca uma letra ao invés
                msgErro("Por favor, apenas numeros!", "ERRO");      // de um numero,
            }                                                       // gerando uma mensagem e retornando para a opção de escolher uma opção

        }
    }

    // Funções que criei para exibir as mensagem do JOptionPane, para evitar digitar
    // o JOption o tempo todo!
    public static void msgDefault(String msg, String titulo) {
        JOptionPane.showMessageDialog(null, msg, titulo, JOptionPane.INFORMATION_MESSAGE);
    }

    public static int msgInput(String msg, String titulo) {
        return Integer.parseInt(JOptionPane.showInputDialog(null, msg, titulo, JOptionPane.QUESTION_MESSAGE));
    }

    public static int msgConfirmar(String msg, String titulo) {
        return JOptionPane.showConfirmDialog(null, msg, titulo, JOptionPane.YES_NO_OPTION);
    }

    public static void msgErro(String msg, String titulo) {
        JOptionPane.showMessageDialog(null, msg, titulo, JOptionPane.ERROR_MESSAGE);
    }
}
