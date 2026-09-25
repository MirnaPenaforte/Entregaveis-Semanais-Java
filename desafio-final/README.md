# Desafio Final – Sistema de Pagamentos

Projeto Java desenvolvido para o exercício de Programação Orientada a Objetos.

## Conceitos aplicados

- classe abstrata (`FormaPagamento`);
- herança (`Pix`, `Debito` e `Credito`);
- polimorfismo nos métodos `pagar()` e `exibirDetalhes()`;
- encapsulamento com atributos privados;
- validação de valor antes do processamento.

## Como executar no IntelliJ IDEA

1. Abra a pasta `desafio-final` no IntelliJ IDEA.
2. Aguarde o IntelliJ importar o arquivo `pom.xml`.
3. Execute a classe `br.com.desafiofinal.Main`.

Também é possível executar pelo terminal com:

```bash
mvn clean compile exec:java
```

O projeto utiliza Java 17.
