public class Main {
    public static void main(String[] args) {
        Elevador elevador = new Elevador(0, 600);

        System.out.println("=== Cenário 1: subida bem-sucedida ===");
        elevador.adicionarPeso(250);
        elevador.subirAndar();

        System.out.println();
        System.out.println("=== Cenário 2: subida bloqueada por excesso de peso ===");
        elevador.adicionarPeso(400);
        elevador.subirAndar();
    }
}
