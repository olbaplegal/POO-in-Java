//Faça uma classe para uma montadora de automóveis.
public class Montadora {
    public Montadora(String nome, String endereco, int cnpj) {
        Nome = nome;
        Endereco = endereco;
        CNPJ = cnpj;
    } 
    
    String Nome;
    String Endereco;
    int CNPJ;

    public void ExibirDados() {
        System.out.println("Nome: "+ Nome);
        System.out.println("Endereço: " + Endereco);
        System.out.println("CNPJ: " + CNPJ);
    }
}
