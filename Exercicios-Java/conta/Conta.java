
import java.text.DecimalFormat;
import java.util.*;

public class Conta {
    
    private String nomeTitular;
    private int    numero;
    private int    agencia;
    private double saldo;
    private Date   data_abertura;

    public Conta() {
        super();
    }

    public Conta(String nomeTitular, int numero, int agencia, double saldo, Date data_abertura) {
        this.nomeTitular = nomeTitular;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.data_abertura = data_abertura;
    }

    public double sacar(double valor){
        this.saldo -= valor;
        return valor;
    }

    public double depositar(double valor){
        this.saldo += valor;
        return valor;
    }

    public void calculaRendimento(int meses){
        DecimalFormat formatador = new DecimalFormat("0.00");
        
        double valorRendido = 500;
        double percentual = 0;
        for(int cont = 0; cont < meses; cont++){
           percentual = valorRendido * (0.5/100);
           valorRendido = valorRendido + percentual;
        }

        double acrescimo = valorRendido - 500;
        System.out.println("Sua conta em " + meses + " meses vai render de R$ " + formatador.format(acrescimo) + " reais" +
                           "\nFicaria um total de R$ " + formatador.format(valorRendido) + " reais");

    }

    public String getNomeTitular() {
        return this.nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Date getData_abertura() {
        return this.data_abertura;
    }

    public void setData_abertura(Date data_abertura) {
        this.data_abertura = data_abertura;
    }
}
