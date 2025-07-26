Tarefa Módulo 13 - Orientação a Objetos com Pessoa

Este projeto foi desenvolvido para a tarefa do Módulo 13, com o objetivo de aplicar os conceitos de Orientação a Objetos em Java, utilizando:

 Classe abstrata
  Herança
  Método abstrato
  Encapsulamento

 Estrutura do Projeto

 `Pessoa.java`: classe **abstrata** com propriedades comuns (nome e documento).
 `PessoaFisica.java`: classe concreta com propriedade específica `RG`.
 `PessoaJuridica.java`: classe concreta com propriedade específica `razão social`.
 `Main.java`: classe principal responsável por instanciar e exibir os dados.

Funcionalidades

 Criar objetos do tipo `PessoaFisica` e `PessoaJuridica`
 Exibir os dados personalizados de cada tipo de pessoa com o método `exibirDados()`


Conceitos aplicados

Classe Abstrata**: `Pessoa` não pode ser instanciada diretamente.
  Herança**: `PessoaFisica` e `PessoaJuridica` herdam de `Pessoa`.
  Polimorfismo**: uso do método `exibirDados()` de forma diferente em cada classe.
  Encapsulamento**: atributos com `private` ou `protected` e uso de construtores.

 Como executar

1. Abra o projeto no **IntelliJ IDEA**
2. Rode a classe `Main.java`
3. O console exibirá os dados da pessoa física e jurídica:

