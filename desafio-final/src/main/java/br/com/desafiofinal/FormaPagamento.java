package br.com.desafiofinal;

/** Classe base para todas as formas de pagamento. */
public abstract class FormaPagamento {
    private final double valor;
    private String status;

    protected FormaPagamento(double valor) {
        this.valor = valor;
        this.status = "Pendente";
    }

    public final void pagar() {
        if (valor <= 0) {
            status = "Recusado: o valor deve ser maior que zero";
            System.out.printf("Pagamento recusado (%s): o valor deve ser maior que zero.%n", tipo());
            return;
        }

        processarPagamento();
    }

    protected abstract void processarPagamento();

    public abstract void exibirDetalhes();

    protected abstract String tipo();

    public double getValor() {
        return valor;
    }

    public String getStatus() {
        return status;
    }

    protected void atualizarStatus(String status) {
        this.status = status;
    }
}
