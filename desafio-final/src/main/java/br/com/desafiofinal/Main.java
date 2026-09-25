package br.com.desafiofinal;

public class Main {
    public static void main(String[] args) {
        FormaPagamento pix = new Pix(150.00, "cliente@email.com");
        FormaPagamento debito = new Debito(80.00, 100.00);
        FormaPagamento credito = new Credito(750.00, 500.00);
        FormaPagamento valorInvalido = new Pix(0.00, "cliente@email.com");

        FormaPagamento[] pagamentos = {pix, debito, credito, valorInvalido};

        System.out.println("=== Processamento dos pagamentos ===");
        for (FormaPagamento pagamento : pagamentos) {
            pagamento.pagar();
            pagamento.exibirDetalhes();
            System.out.println();
        }
    }
}
