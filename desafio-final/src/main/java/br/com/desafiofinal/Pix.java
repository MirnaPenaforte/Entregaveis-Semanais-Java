package br.com.desafiofinal;

public class Pix extends FormaPagamento {
    private final String chavePix;

    public Pix(double valor, String chavePix) {
        super(valor);
        this.chavePix = chavePix;
    }

    @Override
    protected void processarPagamento() {
        atualizarStatus("Aprovado");
        System.out.printf("Pix de R$ %.2f aprovado para a chave %s.%n", getValor(), chavePix);
    }

    @Override
    public void exibirDetalhes() {
        System.out.printf("Tipo: Pix | Valor: R$ %.2f | Chave: %s | Status: %s%n",
                getValor(), chavePix, getStatus());
    }

    @Override
    protected String tipo() {
        return "Pix";
    }
}
