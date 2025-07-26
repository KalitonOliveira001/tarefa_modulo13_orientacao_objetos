// Classe concreta que representa uma Pessoa Física (PF)
public class PessoaFisica extends Pessoa {
    // Propriedade específica de Pessoa Física
    private String rg;

    // Construtor da Pessoa Física
    public PessoaFisica(String nome, String cpf, String rg) {
        super(nome, cpf); // chama o construtor da classe Pessoa
        this.rg = rg;
    }

    // Implementação do método abstrato
    @Override
    public void exibirDados() {
        System.out.println("Pessoa Física:");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + documento);
        System.out.println("RG: " + rg);
    }
}
