package br.ada.tech.funcionalclass;

import java.math.BigDecimal;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Calculadora {

    private Function<String, BiFunction<BigDecimal, BigDecimal, BigDecimal>> operadores = (value) -> {
        switch (value) {
            case "+" -> {
                return (first, second) -> first.add(second);
            }
            case "-" -> {
                return (first, second) -> first.subtract(second);
            }
            case "*" -> {
                return (first, second) -> first.multiply(second);
            }
            case "/" -> {
                return (first, second) -> first.divide(second);
            }
            default -> {
                return (first, second) -> first;
            }
        }
    };

    public BigDecimal executaOperacao() {
        var input = new InputData<>("Informe o primeiro valor:", Main.bigDecimalConverter);
        var first = input.capture();

        var inputOperadores = new InputData<>("Informe o operador:", operadores);
        var operacao = inputOperadores.capture();

        input = new InputData<>("Informe o segundo valor:", Main.bigDecimalConverter);
        var second = input.capture();

        return operacao.apply(first, second);
    }
}
