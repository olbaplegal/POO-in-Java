public class CalculaIMC {

    private double peso;   
    private double altura; 
    private double imc;    

    public CalculaIMC(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
        this.calcularIMC();
    }

    public void calcularIMC() {
        if (altura > 0) {
            this.imc = this.peso / (this.altura * this.altura);
        } else {
            this.imc = 0;
        }
    }

    public double getIMC() {
        return this.imc;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        calcularIMC(); 
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
        calcularIMC();
    }

}
