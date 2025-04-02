//Crie uma classe que ao receber um vetor, vai retornar a média, o máximo, mínimo, somatório e produtório.
class Classe {
    public void Calcular(int[] vetor) {
        if (vetor.length == 0) {
            System.out.println("O vetor está vazio.");
            return;
        }

        int min = vetor[0];
        int max = vetor[0];
        int somatorio = 0;
        int produtorio = 1; // Inicializa com 1 para multiplicação
        double media;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < min) {
                min = vetor[i];
            }
            if (vetor[i] > max) {
                max = vetor[i];
            }
            somatorio += vetor[i];
            produtorio *= vetor[i];
        }

        media = (double) somatorio / vetor.length; // Força divisão com ponto flutuante e conversão explicita braba

        System.out.println("Mínimo: " + min);
        System.out.println("Máximo: " + max);
        System.out.println("Média: " + media);
        System.out.println("Somatório: " + somatorio);
        System.out.println("Produtório: " + produtorio);
    }
}
//teste
public class Main {
    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5}; // definindo vetor

        Classe obj = new Classe(); // Criando objeto da classe
        obj.Calcular(vetor); // Chamando o método
    }
}