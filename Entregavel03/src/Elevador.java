public class Elevador {
    private int andarAtual;
    private final double pesoMaximo;
    private double pesoAtual;

    public Elevador(int andarInicial, double pesoMaximo) {
        if (andarInicial < 0) {
            throw new IllegalArgumentException("O andar inicial não pode ser negativo.");
        }
        if (pesoMaximo <= 0) {
            throw new IllegalArgumentException("O peso máximo deve ser maior que zero.");
        }

        this.andarAtual = andarInicial;
        this.pesoMaximo = pesoMaximo;
        this.pesoAtual = 0;
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public double getPesoMaximo() {
        return pesoMaximo;
    }

    public double getPesoAtual() {
        return pesoAtual;
    }

    public void adicionarPeso(double peso) {
        if (peso <= 0) {
            throw new IllegalArgumentException("O peso adicionado deve ser maior que zero.");
        }
        pesoAtual += peso;
    }

    public void removerPeso(double peso) {
        if (peso <= 0 || peso > pesoAtual) {
            throw new IllegalArgumentException("O peso removido é inválido.");
        }
        pesoAtual -= peso;
    }

    public void subirAndar() {
        if (pesoAtual > pesoMaximo) {
            System.out.printf(
                    "O elevador não vai sair do andar %d por excesso de peso (%.2f kg de %.2f kg).%n",
                    andarAtual, pesoAtual, pesoMaximo);
            return;
        }

        andarAtual++;
        System.out.println("Subida realizada com sucesso. O elevador parou no andar " + andarAtual + ".");
    }
}
