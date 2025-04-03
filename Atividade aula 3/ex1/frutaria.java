public class frutaria {
    String Endereco;
    String Nome;
    int CNPJ;
    
    public frutaria(String nome, String endereco, int cnpj) {
        Nome = nome;
        Endereco = endereco;
        CNPJ = cnpj;
    }

    public void ExibirDados() {
        System.out.println("\nNome: " + Nome + "\nEndereço: " + Endereco + "\nCNPJ:" + CNPJ);
    }
}
