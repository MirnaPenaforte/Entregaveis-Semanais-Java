package br.com.desafiofinal;

public class Debito extends FormaPagamento {
    private final double saldoDisponivel;

    public Debito(double valor, double saldoDisponivel) {
        super(valor);
        this.saldoDisponivel = saldoDisponivel;
    }

    @Override
    protected void processarPagamento() {
        if (saldoDisponivel >= getValor()) {
            atualizarStatus("Aprovado");
            System.out.printf("Débito de R$ %.2f aprovado. Saldo disponível: R$ %.2f.%n",
                    getValor(), saldoDisponivel);
        } else {
            atualizarStatus("Recusado: saldo insuficiente");
            System.out.printf("Débito de R$ %.2f recusado: saldo insuficiente.%n", getValor());
        }
    }

    @Override
    public void exibirDetalhes() {
        System.out.printf("Tipo: Débito | Valor: R$ %.2f | Saldo consultado: R$ %.2f | Status: %s%n",
                getValor(), saldoDisponivel, getStatus());
    }

    @Override
    protected String tipo() {
        return "Débito";
    }
}
