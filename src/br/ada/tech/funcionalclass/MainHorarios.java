package br.ada.tech.funcionalclass;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainHorarios {

    public static void main(String[] args) {
        List<RegistroPonto> registroPontos = new ArrayList<>();
        Random random = new Random();
        for (int index = 0; index < 100; index++) {
            var horas = random.nextInt(1, 10);
            registroPontos.add(new RegistroPonto(LocalDateTime.now().minusHours(horas), LocalDateTime.now()));
        }

        // Utilizando a lista de ponto acima, calcule quais o registros passaram de horas trabalhadas.
        // Os registros que passarem de oito horas devem ser impressos na tela.
    }

}
