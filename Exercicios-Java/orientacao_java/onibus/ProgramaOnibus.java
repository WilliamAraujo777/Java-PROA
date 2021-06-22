package orientacao_java.onibus;

public class ProgramaOnibus{

public static void main(String[] args) {

    Onibus onibus1 = new Onibus("São Paulo", 5, 40, 30);
    Onibus onibus2 = new Onibus("Maranhão", 6, 50, 45);
    Onibus onibus3 = new Onibus("Recife", 4, 45, 35);

    //Onibus 1
    onibus1.definirLocal("Rio de janeiro");
    
    onibus1.andar();
    onibus2.andar();
    onibus3.andar();

    System.out.println("O primeiro ônibus:"
    + "\nLocal Atual: " + onibus1.returnNomeLocal() 
    + "\nParadas: " + onibus1.returnQtdParada() 
    + "\nCapacidade máxima de pessoas: " + onibus2.returnCapacidade() 
    + "\nQuantidade de Pessoas: " + onibus2.returnQtdPessoa() + "\n");
    
    onibus1.definirQtdParada(5);
    onibus1.saiPessoa(4);
    onibus3.entraPessoa(3);

    System.out.println("\nO segundo ônibus:"
    + "\nLocal Atual: " + onibus2.returnNomeLocal() 
    + "\nParadas: " + onibus2.returnQtdParada()  
    + "\nCapacidade máxima de pessoas: " + onibus2.returnCapacidade() 
    + "\nQuantidade de Pessoas: " + onibus2.returnQtdPessoa());

    System.out.println("\nO terceiro ônibus:"
    + "\nLocal Atual: " + onibus3.returnNomeLocal() 
    + "\nParadas: " + onibus3.returnQtdParada()  
    + "\nCapacidade máxima de pessoas: " + onibus3.returnCapacidade() 
    + "\nQuantidade de Pessoas: " + onibus3.returnQtdPessoa());

    // onibus3.entraPessoa(1);
    // onibus2.entraPessoa(5);
    // onibus2.entraPessoa(1);

    // onibus1.parar();
    // onibus2.parar();
    // onibus3.parar();







}

}