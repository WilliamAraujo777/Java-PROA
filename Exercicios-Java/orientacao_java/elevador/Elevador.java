package orientacao_java.elevador;

public class Elevador {
    private int andarAtual = 0;
    private int totalAndares;
    private int capacidadeTotal;
    private int qtdPessoas = 0;

    public Elevador(int totalAndares, int capacidadeTotal) {
        this.totalAndares = totalAndares;
        this.capacidadeTotal = capacidadeTotal;
    }

    public void entrarPessoa(int pessoa) {
        int lugarDisponivel = this.capacidadeTotal - this.qtdPessoas;
        if (lugarDisponivel > 0) {
            this.qtdPessoas += pessoa;
            if (this.qtdPessoas < this.capacidadeTotal) {
                System.out.println("Entrou " + pessoa + " pessoa(s)" + "\nAtualmente encontra-se com: "
                        + this.qtdPessoas + " pessoas!");
            } else {
                this.qtdPessoas = this.capacidadeTotal;
                System.out.println("O elevador não pode ter pessoas além do limite!" + "\nAtualmente encontra-se com: "
                        + this.qtdPessoas);
            }
        } else {
            System.out.println("O elevador já está cheio!");
        }
    }

    public void sairPessoa(int pessoa) {
        if (this.qtdPessoas > 0) {
            this.qtdPessoas -= pessoa;
            if (qtdPessoas <= 0) {
                System.out.println("Desceu " + pessoa + " pessoas(s)" + "\nAtualmente encontra-se vazio!");
            } else if (qtdPessoas > 0) {
                System.out.println("Desceu " + pessoa + " pessoas(s)" + "\nAtualmente encontra-se com: "
                        + this.qtdPessoas + " pessoas");
            }
        } else {
            System.out.println("O elevador já está vazio!");
        }
    }

    public void subir(int andar) {
        int andarDisponivel = this.totalAndares - this.andarAtual;
        if (andarDisponivel > 0) {
            this.andarAtual += andar;
            if (this.andarAtual < this.totalAndares) {
                System.out
                        .println("Subiu " + andar + " andar(res)" + "\nAtualmente encontra-se em: " + this.andarAtual);
            } else {
                System.out.println("O elevador não pode subir além do limite!" + "\nAtualmente encontra-se em: "
                        + this.totalAndares);
            }
        } else {
            System.out.println("O elevador já está no topo!");
        }
    }

    public void descer(int andar) {
        if (this.andarAtual > 0) {
            this.andarAtual -= andar;
            if (andarAtual == 0) {
                System.out.println("Desceu " + andar + " andar(res)" + "\nAtualmente encontra-se no térreo");
            } else if (andarAtual > 0) {
                System.out.println(
                        "Desceu " + andar + " andar(res)" + "\nAtualmente encontra-se no andar: " + this.andarAtual);
            } else {
                System.out.print("Elevador não pode descer abaixo do térreo, agora ele se encontra no térreo!");
            }
        } else {
            System.out.println("O elevador já está no térreo!");
        }
    }

    public int getAndarAtual() {
        return this.andarAtual;
    }

    public int getTotalAndares() {
        return this.totalAndares;
    }

    public int getCapacidadeTotal() {
        return this.capacidadeTotal;
    }

    public int getQtdPessoas() {
        return this.qtdPessoas;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public void setCapacidadeTotal(int capacidadeTotal) {
        this.capacidadeTotal = capacidadeTotal;
    }

    public void setQtdPessoa(int qtdPessoas) {
        this.qtdPessoas = qtdPessoas;
    }
}
/*
 * Crie uma classe denominada Elevador para armazenar as informações de um
 * elevador dentro de um prédio. A classe deve armazenar o andar atual (térreo =
 * 0), total de andares no prédio (desconsiderando o térreo), capacidade do
 * elevador e quantas pessoas estão presentes nele. A classe deve também
 * disponibilizar os seguintes métodos:
 * 
 * 
 * 
 * Inicializa : que deve receber como parâmetros a capacidade do elevador e o
 * total de andares no prédio (os elevadores sempre começam no térreo e vazio);
 * Entra: para acrescentar uma pessoa no elevador (só deve acrescentar se ainda
 * houver espaço); Sai: para remover uma pessoa do elevador (só deve remover se
 * houver alguém dentro dele); Sobe: para subir um andar (não deve subir se já
 * estiver no último andar); Desce: para descer um andar (não deve descer se já
 * estiver no térreo); Encapsular todos os atributos da classe (criar os métodos
 * set e get);
 */
