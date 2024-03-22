package br.ada.tech.funcionalclass;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MainConsumer {

    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("William");
        nomes.add("Cesar");
        nomes.add("José");

        var consumer = new Consumer<>() {
            @Override
            public void accept(Object value) {
                System.out.println(value);
            }
        };
        Consumer<String> consumerLambda = (value) -> System.out.println(value);
        nomes.forEach(System.out::println);

        Person person = new Person();
        nomes.forEach(person::setName);
//        for (String nome : nomes) {
//            System.out.println(nome);
//        }


        for (String nome : nomes) {
            if (nome.length() > 4) {
                System.out.println(nome);
            }
        }
        Predicate<String> filtro4Caracteres = new Predicate<String>() {
            @Override
            public boolean test(String value) {
                return value.length() > 4;
            }
        };
        System.out.println("--------------------");
        Predicate<String> filtro4CaracteresLambda = (value) -> value.length() > 4;

        nomes.removeIf((value) -> value.length() > 4);
        nomes.forEach(System.out::println);

        var iterator = nomes.iterator();
        while(iterator.hasNext()) {
            String nome = iterator.next();
            if (nome.length() > 4) {
                iterator.remove();
            }
        }
    }

}
