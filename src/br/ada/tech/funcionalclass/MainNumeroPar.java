package br.ada.tech.funcionalclass;

import java.util.stream.Stream;

public class MainNumeroPar {

    public static void main(String[] args) {
//        T seed, Predicate<? super T> hasNext, UnaryOperator<T> next
        Stream<Integer> numeros = Stream.iterate(
                0,//valor inicial
                valorCorrente -> valorCorrente <= 100,//condicional
                valorCorrente -> valorCorrente + 1//Incremento
        );
        numeros.filter(numero -> numero % 2 == 0)
                .map(numero -> numero + " é par")
                .forEach(System.out::println);
    }
}
