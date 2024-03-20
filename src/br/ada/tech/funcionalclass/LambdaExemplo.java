package br.ada.tech.funcionalclass;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Supplier;

public class LambdaExemplo {

    public static void main(String[] args) {
        Supplier<String> imprimirHorarioAtual = new Supplier<String>() {
            @Override
            public String get() {
                return LocalDateTime.now().toString();
            }
        };

        Supplier<String> imprimirHorarioAtualLambda = () -> LocalDateTime.now().toString();

        Supplier<String> operacaoMatematica = new Supplier<String>() {
            @Override
            public String get() {
                return (2 + 2) + "";
            }
        };
        Supplier<String> operacaoMatematicaLambda = () -> (2 + 2) + "";

        Function<String, BigDecimal> converter2 = new Function<String, BigDecimal>() {
            @Override
            public BigDecimal apply(String value) {
                return new BigDecimal(value);
            }
        };
        Function<String, BigDecimal> converter = (value) -> new BigDecimal(value);


        Supplier<String> capturaNome = new Supplier<String>() {
            @Override
            public String get() {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Informe o nome:");
                return scanner.nextLine();
            }
        };
        Supplier<String> capturaNomeLambda = () -> {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Informe o nome:");
            return scanner.nextLine();
        };

        Person william = new Person();
        william.setName("William");

        new LambdaExemplo().imprimirResultado(william::getName);
    }

    public void imprimirResultado(Supplier<String> execute) {
        var result = execute.get();
        System.out.println(result);
    }

}
