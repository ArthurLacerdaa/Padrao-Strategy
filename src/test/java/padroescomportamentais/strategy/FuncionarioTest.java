package padroescomportamentais.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    void deveSomarSalarioFuncionario() {
        Funcionario funcionario = new Funcionario();
        funcionario.somarSalario(2000.0f, 500.0f);
        assertEquals(2500.0f, funcionario.getSalario());
    }

    @Test
    void deveSubtrairSalarioFuncionario() {
        Funcionario funcionario = new Funcionario();
        funcionario.subtrairSalario(2000.0f, 300.0f);
        assertEquals(1700.0f, funcionario.getSalario());
    }

    @Test
    void deveMultiplicarSalarioFuncionario() {
        Funcionario funcionario = new Funcionario();
        funcionario.multiplicarSalario(2000.0f, 1.1f);
        assertEquals(2200.0f, funcionario.getSalario());
    }

    @Test
    void deveDividirSalarioFuncionario() {
        Funcionario funcionario = new Funcionario();
        funcionario.dividirSalario(3000.0f, 30.0f);
        assertEquals(100.0f, funcionario.getSalario());
    }

    @Test
    void naoDeveDividirSalarioFuncionarioPorZero() {
        try {
            Funcionario funcionario = new Funcionario();
            funcionario.dividirSalario(3000.0f, 0.0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Divisão por zero", e.getMessage());
        }
    }

    @Test
    void deveCalcularMediaSalarioFuncionario() {
        Funcionario funcionario = new Funcionario();
        funcionario.calcularMediaSalarios(2000.0f, 3000.0f);
        assertEquals(2500.0f, funcionario.getSalario());
    }

}
