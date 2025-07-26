// Classe abstrata que representa uma pessoa
public abstract class Pessoa {
    // Nome é comum para todas as pessoas
    protected String nome;

    // CPF ou CNPJ também são identificadores comuns
    protected String documento;

    // Construtor da classe abstrata Pessoa
    public Pessoa(String nome, String documento) {
        this.nome = nome;
        this.documento = documento;
    }

    // Método abstrato que será implementado nas classes filhas
    public abstract void exibirDados();
}

