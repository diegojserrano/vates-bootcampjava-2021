import java.util.HashMap;
import java.util.Map;
import java.util.function.DoubleBinaryOperator;

public class Calculadora {

    Map<String, DoubleBinaryOperator> operaciones;

    public Calculadora() {
        this.operaciones = new HashMap<>();
        operaciones.put("+", (a, b) -> a + b);
        operaciones.put("-", (a, b) -> a - b);
        operaciones.put("*", (a, b) -> a * b);
        operaciones.put("/", (a, b) -> a / b);
        operaciones.put("^", (a, b) -> Math.pow(a, b));
        operaciones.put("raiz", (a, b) -> Math.pow(b, 1.0/a));
    }

    public double calcular(double ope1, String operacion, double ope2) {
        return operaciones.get(operacion).applyAsDouble(ope1, ope2);
    }
}
