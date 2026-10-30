package padroescomportamentais.strategy;

public class Funcionario {

    private float salario;

    public float getSalario() {
        return salario;
    }

    public void somarSalario(float salario1, float salario2) {
        Calculadora calculadora = new Calculadora(salario1, salario2);
        this.salario = calculadora.calcular(new OperacaoSomar());
    }

    public void subtrairSalario(float salario1, float salario2) {
        Calculadora calculadora = new Calculadora(salario1, salario2);
        this.salario = calculadora.calcular(new OperacaoSubtrair());
    }

    public void dividirSalario(float salario1, float salario2) {
        Calculadora calculadora = new Calculadora(salario1, salario2);
        this.salario = calculadora.calcular(new OperacaoDividir());
    }

    public void multiplicarSalario(float salario1, float salario2) {
        Calculadora calculadora = new Calculadora(salario1, salario2);
        this.salario = calculadora.calcular(new OperacaoMultiplicar());
    }

    public void calcularMediaSalarios(float salario1, float salario2) {
        Calculadora calculadora = new Calculadora(salario1, salario2);
        this.salario = calculadora.calcular(new OperacaoMedia());
    }

}
