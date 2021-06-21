
class Conta {
    int numero;
    String titular;
    double saldo;
    int agencia;
    Date data_criacao;
    String banco;
}

class formaDeVida {
    Date data_criacao;
    int expectativa_vida;
    Date date_final;
}

class Veiculos {
    double  combustivel;
    String  marca;
    String  motor;
    int     preco;
    boolean possui_rodas;
    boolean conduzido;
    double  peso;
    double  velocidade; 
    double  velocidade_maxima;
    double  kilometragem;
}

class Carro extends Veiculos{
    int     qtdPortas;
    String  cor;
    int     qtdAssento;
    boolean automatico;
    String  placa;
    String  proprietario;
    boolean blindagem;
}

class Animal {
    String nome;
    String nomeCientifico;
    String dieta;
    String filo;
    String classe;
    String ordem;
    String familia;
    String genero;
    String especie;
    String habitat;
}


class Personagem {
    String nome;
    String personalidade;
    String pai;
    String mae;
    String etnia;
}

class Ferramenta {
    String nome;
    String utilidade;
    String cor;
    double tamanho;
    double preco;
    String maraca;
}

class Conversa {
    int    qtdPessoas;
    String meio;
    String linguagem;
    String assunto;
    String idioma;
    String sentimento;
    String tempo;
}

class Pensamento {
    String motivo;
}