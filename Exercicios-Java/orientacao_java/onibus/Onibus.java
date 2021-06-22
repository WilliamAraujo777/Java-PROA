package orientacao_java.onibus;

public class Onibus {
     private String nomeLocal;
     private int qtdParada;
     private int capacidadeTotal;
     private int qtdPessoas;

    public Onibus(String nomeLocal, int qtdParada, int capacidadeTotal, int qtdPessoas) {
        this.nomeLocal = nomeLocal;
        this.qtdParada = qtdParada;
        this.capacidadeTotal = capacidadeTotal;
        this.qtdPessoas = qtdPessoas;
    }

    public void andar() {
        System.out.println("O ônibus que está em " + this.nomeLocal + " está andando!");
    }

    public void parar() {
        System.out.println("O ônibus que está em " + this.nomeLocal + " parou!");
    }

    public void entraPessoa(int pessoa) {
        if (this.qtdPessoas < this.capacidadeTotal) {
            this.qtdPessoas += pessoa;
            System.out.println("Entrou " + pessoa + "pessoa(s) no onibus que está em " + this.nomeLocal
                    + "\nAgora possui " + this.qtdPessoas);
        } else {
            System.out.println("O ônibus que está em " + this.nomeLocal + " está cheio!");
        }
    }

    public void saiPessoa(int pessoa) {
        if (this.qtdPessoas > 0) {
            this.qtdPessoas -= pessoa;
            System.out.println("Saiu " + pessoa + "pessoa(s) no onibus que está em " + this.nomeLocal
                    + "\nAgora possui " + this.qtdPessoas);
        } else {
            System.out.println("O ônibus que está em " + this.nomeLocal + " está vazio!");
        }
    }

    public String returnNomeLocal() {
        return this.nomeLocal;
    }

    public int returnQtdParada() {
        return this.qtdParada;
    }

    public int returnCapacidade() {
        return this.capacidadeTotal;
    }

    public int returnQtdPessoa() {
        return this.qtdPessoas;
    }

    public void definirLocal(String nomeLocal) {
        this.nomeLocal = nomeLocal;
    }

    public void definirQtdParada(int qtdParada) {
        this.qtdParada = qtdParada;
    }

    public void definirCapacidade(int capacidadeTotal) {
        this.capacidadeTotal = capacidadeTotal;
    }

}

/*
 * Crie uma classe para um ônibus turístico para levar pessoas de São Paulo até
 * uma cidade turística. A classe deve armazenar o local atual, quantidade de
 * paradas, capacidade do ônibus e quantas pessoas estão presentes nele. A
 * classe deve também disponibilizar os seguintes métodos: Inicializa (método
 * construtor), Entra (quando entra alguém), Sai (quando alguém desce do
 * ônibus), Parar (o ônibus para de andar) e andar.
 * 
 * 
 * 
 * Crie um prgrama que instacie essa classe três vezes, listando suas paradas,
 * quantas pessoas sobem e quantas pessoas descem. Dentro do programa, deve ser
 * possível modificar cada um dos atributos do ônibus.
 */