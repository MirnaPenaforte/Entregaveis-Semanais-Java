package br.com.desafiofinal;

public class Credito extends FormaPagamento {
    private final double limiteDisponivel;

    public Credito(double valor, double limiteDisponivel) {
        super(valor);
        this.limiteDisponivel = limiteDisponivel;
    }

    @Override
    protected void processarPagamento() {
        if (limiteDisponivel >= getValor()) {
            atualizarStatus("Aprovado");
            System.out.printf("Crédito de R$ %.2f aprovado. Limite disponível: R$ %.2f.%n",
                    getValor(), limiteDisponivel);
        } else {
            atualizarStatus("Recusado: limite insuficiente");
            System.out.printf("Crédito de R$ %.2f recusado: limite insuficiente.%n", getValor());
        }
    }

    @Override
    public void exibirDetalhes() {
        System.out.printf("Tipo: Crédito | Valor: R$ %.2f | Limite consultado: R$ %.2f | Status: %s%n",
                getValor(), limiteDisponivel, getStatus());
    }

    @Override
    protected String tipo() {
        return "Crédito";
    }
}
