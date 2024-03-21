package br.ada.tech.funcionalclass;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Function<String, LocalDate> dateConverter = (value) -> LocalDate.parse(value, formatter);
        Function<String, BigDecimal> bigDecimalConverter = (value) -> new BigDecimal(value);
        Function<String, String> noConverter = (value) -> value;

        InputData<LocalDate> data = new InputData<>("Informe uma data(dd/MM/yyyy)", dateConverter);
        var value = data.capture();
        System.out.println(value);

        InputData<BigDecimal> dataSalary = new InputData<>("Informe o valor do salario:", bigDecimalConverter);
        var salary = dataSalary.capture();
        System.out.println(salary);

        InputData<String> dataText = new InputData<>("Informe o seu nome:", noConverter);
        var name = dataText.capture();
        System.out.println(name);

        BiFunction<BigDecimal, BigDecimal, String> soma = (first, second) -> first.add(second).toString();
        TriFunction<BigDecimal, BigDecimal, BigDecimal, String> somaTudo =
                (first, second, third) -> first.add(second).add(third).toString();
    }
}
