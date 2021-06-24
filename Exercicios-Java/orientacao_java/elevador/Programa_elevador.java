package orientacao_java.elevador;
public class Programa_elevador{
   
public static void main(String[] args) {

    Elevador elev = new Elevador(10, 8);

    elev.descer(3);
    elev.subir(5);
    elev.descer(10);
    elev.subir(5);
    elev.subir(10);

    elev.entrarPessoa(7);
    elev.entrarPessoa(2);
    elev.sairPessoa(4);
    elev.sairPessoa(5);

    

}

 
}