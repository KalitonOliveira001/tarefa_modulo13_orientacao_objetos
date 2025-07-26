// Classe concreta que representa uma Pessoa Jurídica (PJ)
public class PessoaJuridica extends Pessoa {
    // Propriedade específica de Pessoa Jurídica
    private String razaoSocial;

    // Construtor da Pessoa Jurídica
    public PessoaJuridica(String nomeFantasia, String cnpj, String razaoSocial) {
        super(nomeFantasia, cnpj); // chama o construtor da classe Pessoa
        this.razaoSocial = razaoSocial;
    }

    // Implementação do método abstrato
    @Override
    public void exibirDados() {
        System.out.println("Pessoa Jurídica:");
        System.out.println("Nome Fantasia: " + nome);
        System.out.println("CNPJ: " + documento);
        System.out.println("Razão Social: " + razaoSocial);
    }
}
