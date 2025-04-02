public class Cinematica {
    double posicaoInicial;
    double posicaoFinal;
    double velocidadeInicial;
    double velocidadeFinal;
    double tempo;
    double aceleracao;
 //construtor para pegar tudo na criação do obj
    public Cinematica(double posicaoInicial, double posicaoFinal, double velocidadeInicial,
                      double velocidadeFinal, double tempo, double aceleracao) {
        this.posicaoInicial = posicaoInicial;
        this.posicaoFinal = posicaoFinal;
        this.velocidadeInicial = velocidadeInicial;
        this.velocidadeFinal = velocidadeFinal;
        this.tempo = tempo;
        this.aceleracao = aceleracao;
    }

    public double calcularDeslocamento() {
        return posicaoFinal - posicaoInicial;
    }

    public double calcularVelocidadeMedia() {
        return calcularDeslocamento() / tempo;
    }

    public double calcularAceleracao() {
        return (velocidadeFinal - velocidadeInicial) / tempo;
    }

    public double calcularPosicaoMUV() {
        return posicaoInicial + velocidadeInicial * tempo + 0.5 * aceleracao * Math.pow(tempo, 2);
    }

    public double calcularTorricelli() {
        return Math.pow(velocidadeInicial, 2) + 2 * aceleracao * calcularDeslocamento();
    }
}