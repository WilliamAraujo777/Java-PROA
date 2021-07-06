package orientacao_java.onibus;

public class Programa{

public static void main(String[] args) {

    Onibus bus = new Onibus("JD. Nakamura", 5, 30, 25);


    System.out.println("O onibus com destino a " + bus.returnNomeLocal());

    


}

}