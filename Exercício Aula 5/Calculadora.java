public abstract class Calculadora {
    protected double operando1;
    protected double operando2;

    public Calculadora(double operando1, double operando2) {
        this.operando1 = operando1;
        this.operando2 = operando2;
    }

    public abstract double calcular();
}

class Soma extends Calculadora {
    public Soma(double operando1, double operando2) {
        super(operando1, operando2);
    }

    @Override
    public double calcular() {
        return operando1 + operando2;
    }
}

class Subtracao extends Calculadora {
    public Subtracao(double operando1, double operando2) {
        super(operando1, operando2);
    }

    @Override
    public double calcular() {
        return operando1 - operando2;
    }
}

class Multiplicacao extends Calculadora {
    public Multiplicacao(double operando1, double operando2) {
        super(operando1, operando2);
    }

    @Override
    public double calcular() {
        return operando1 * operando2;
    }
}

class Main{
    public static void main(String[] args) {
        Calculadora c1 = new Soma(10, 5);
        Calculadora c2 = new Subtracao(10, 5);
        Calculadora c3 = new Multiplicacao(10, 5);

        System.out.println("Soma: " + c1.calcular());
        System.out.println("Subtração: " + c2.calcular());
        System.out.println("Multiplicação: " + c3.calcular());
    }
}
