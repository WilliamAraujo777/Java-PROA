import javax.swing.JOptionPane;
public class TestaConta {

    public static void main(String[] args) {
        Conta conta = new Conta();

        int agencia = 0;
        boolean continua = true;
        int numeroConta = 0;
        int tentativa = 3;
        int opcao = 0;

        conta.setAgencia(1234);
        conta.setNumero(777);
        conta.setSaldo(170);
        conta.setNomeTitular("William");

        msgDefault("Boas vindas ao banco!");

        //Laço de repetição responsável por verificar se a agência está correta
        while (continua) {
            agencia = msgInput("Digite sua agencia: ");
            if (conta.getAgencia() == agencia) {
                msgDefault("Agência correta! Prossiga");
                continua = false;
            } else {
                tentativa -= 1;
                if (tentativa < 1) {
                    msgErro("Conta bloqueada, não há mais tentativas restantes, contate o ADM!");
                    System.exit(0);
                } else {
                    msgErro("Agencia incorreta! Digite novamente! " + "\nPS: Você tem " + tentativa
                            + " tentativa(s) restante(s)!!");
                }
            }
        }

        continua = true;
        tentativa = 3;

        // Laço de repetição responsável por verificar se a conta está correta
        while (continua) {
            numeroConta = msgInput("Digite sua conta: ");
            System.out.println(numeroConta);
            if (conta.getNumero() == numeroConta) {
                msgDefault("Numero da conta correto! Prossiga para os nossos serviços ^^");
                continua = false;
            } else {
                tentativa -= 1;
                if (tentativa < 1) {
                    msgErro("Conta bloqueada, não há mais tentativas restantes, contate o ADM!");
                    System.exit(0);
                } else {
                    msgErro("Numero da conta incorreto! Digite novamente! " + "\nPS: Você tem " + tentativa
                            + " tentativa(s) restante(s)!!");
                }
            }
        }

        continua = true;
        while (continua) {
            opcao = msgInput("Selecione a opção desejada: " + "\n 1 = Ver Saldo" + "\n 2 = Depositar" + "\n 3 = Sacar"
                    + "\n 4 = Verificar rendimento da conta " + "\n 5 = Finalizar sistema ");

            switch (opcao) {
                case 1:
                    msgDefault("O seu saldo é de R$ " + conta.getSaldo() + ",00");
                    break;

                case 2:
                    msgDefault("O seu saldo é de R$ " + conta.getSaldo() + ",00");
                    break;

                case 3:
                    msgDefault("O seu saldo é de R$ " + conta.getSaldo() + ",00");
                    break;
                case 4:
                    msgDefault("O seu saldo é de R$ " + conta.getSaldo() + ",00");
                    break;
                case 5:
                    msgDefault("Obrigado por utilizar nossos serviços " + conta.getNomeTitular() + "\nO banco será finalizado!");
                    System.exit(0);
                    break;
                    
                default:
                    msgErro("Opção inválida! Por favor, selecione uma opção entre 1 e 5!");
            }
        }
    }

    // Funções que criei para exibir as mensagem do JOptionPane, para evitar digitar
    // o JOption o tempo todo!
    public static void msgDefault(String msg) {
        JOptionPane.showMessageDialog(null, msg, "Banco WILL SA.", JOptionPane.INFORMATION_MESSAGE);
    }

    public static int msgInput(String opcao) {
        return Integer.parseInt(JOptionPane.showInputDialog(opcao));
    }

    public static void msgErro(String msg) {
        JOptionPane.showMessageDialog(null, msg, "Banco WILL SA.", JOptionPane.ERROR_MESSAGE);
    }

}
