public class Hospital {
    private String nome;
    private int idade;
    private String diagnostico;

    public void exibirFicha() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Diagnóstico: " + diagnostico);
    }

    public void atualizarDiagnostico(String novoDiagnostico) {
        this.diagnostico = novoDiagnostico;
    }
}