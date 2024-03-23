package br.ada.tech.funcionalclass;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class MainHorarios {

    public static void main(String[] args) {
        List<RegistroPonto> registroPontos = new ArrayList<>();
        Random random = new Random();
        for (int index = 0; index < 100; index++) {
            var horas = random.nextInt(1, 15);
            registroPontos.add(new RegistroPonto(
                            LocalDateTime.now().minusHours(horas),
                            LocalDateTime.now(),
                            "Index:" + index
                    )
            );
        }

        // Utilizando a lista de ponto acima, calcule quais o registros passaram de horas trabalhadas.
        // Os registros que passarem de oito horas devem ser impressos na tela.
//        registroPontos.forEach(ponto -> {
//            var horasTrabalhadas = ChronoUnit.HOURS.between(ponto.entrada(), ponto.saida());
//            if (horasTrabalhadas > 8) {
//                System.out.println(ponto);
//            }
//        });
        // Utilizando a lista de ponto acima, construa um stream.
        // Para cada registro de ponto dentro do stream, calcule se excedeu 8 horas trabalhadas.
        // Caso tenha excedido imprima na tela o valor: $nome, você ganhou um dia de folga.
        registroPontos.stream()
                .filter(ponto -> Duration.between(ponto.entrada(), ponto.saida()).toHours() > 8)
                .map(ponto -> ponto.nome() + ", você ganhou um dia de folga!")
                .forEach(System.out::println);
        /*
        registroPontos.forEach(new Consumer<RegistroPonto>() {
            @Override
            public void accept(RegistroPonto ponto) {
                var horasTrabalhadas = ChronoUnit.HOURS.between(ponto.entrada(), ponto.saida());
                if (horasTrabalhadas > 8) {
                    System.out.println(ponto);
                }
            }
        });
        for (RegistroPonto ponto : registroPontos) {
            var horasTrabalhadas = ChronoUnit.HOURS.between(ponto.entrada(), ponto.saida());
            if (horasTrabalhadas > 8) {
                System.out.println(ponto);
            }
        }
        */
    }

}
