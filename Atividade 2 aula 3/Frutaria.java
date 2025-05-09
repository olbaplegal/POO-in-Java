public class Frutaria {
    private String nome;
    private double precoPorKg;
    private boolean disponivel;

    public void exibirInfo() {
        System.out.println("Fruta: " + nome);
        System.out.println("Preço por Kg: R$" + precoPorKg);
        System.out.println("Disponível: " + (disponivel ? "Sim" : "Não"));
    }

    public void atualizarDisponibilidade(boolean status) {
        this.disponivel = status;
    }
}
