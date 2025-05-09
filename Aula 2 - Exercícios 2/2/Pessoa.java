import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Pessoa {
    private String nome;
    private int idade;
    private String email;

    public void carregarDeArquivo(String caminhoArquivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linhaNome = br.readLine();
            String linhaIdade = br.readLine();
            String linhaEmail = br.readLine();

            if (linhaNome != null && linhaIdade != null && linhaEmail != null) {
                this.nome = linhaNome;
                this.idade = Integer.parseInt(linhaIdade);
                this.email = linhaEmail;
            } else {
                System.out.println("Arquivo incompleto ou mal formatado.");
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getEmail() {
        return email;
    }

    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.carregarDeArquivo("D:\\Dev\\poo-java\\Aula 2 - Exercícios 2\\2\\texto.txt");

        System.out.println("Nome: " + p.getNome());
        System.out.println("Idade: " + p.getIdade());
        System.out.println("Email: " + p.getEmail());
    }
}
