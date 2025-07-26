// Classe principal que executa o programa
public class Main {
    public static void main(String[] args) {
        // Criando um objeto de Pessoa Física
        Pessoa pf = new PessoaFisica("João da Silva", "123.456.789-00", "MG-12.345.678");
        pf.exibirDados();

        System.out.println(); // linha em branco

        // Criando um objeto de Pessoa Jurídica
        Pessoa pj = new PessoaJuridica("Tech Solutions", "12.345.678/0001-99", "Tech Solutions LTDA");
        pj.exibirDados();
    }
}

