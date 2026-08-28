public class Main {

    public static void main (String[] args){

        Pessoa pessoa = new Pessoa("Mirna", 37, 1.70, true);
        Pessoa pessoa1 = new Pessoa("Juvenal", 50, 1.20, false);
        Pessoa pessoa2 = new Pessoa("Jesus", 33, 1.90, true);

        Pessoa maisVelha = pessoa;

        if (pessoa1.idade > maisVelha.idade) {
            maisVelha = pessoa1;
        }

        if (pessoa2.idade > maisVelha.idade) {
            maisVelha = pessoa2;
        }

        switch (maisVelha.nome) {
            case "Mirna":
                System.out.println("Mirna é a pessoa mais velha.");
                break;

            case "Juvenal":
                System.out.println("Juvenal é a pessoa mais velha.");
                break;

            case "Jesus":
                System.out.println("Jesus é a pessoa mais velha.");
                break;

            default:
                System.out.println("Pessoa não identificada.");
        }

        Carro carro = new Carro("BYD", 2026, true);
        Carro carro1 = new Carro("Toyota", 2020, true);

        System.out.println("\nDados do carro:");
        System.out.println("Marca: " + carro.marca);
        System.out.println("Ano: " + carro.ano);
        System.out.println("Está à venda: " + carro.venda);
    }
}