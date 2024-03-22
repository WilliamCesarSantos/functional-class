package br.ada.tech.funcionalclass;

import java.time.LocalDateTime;

public class RegistroPonto {

    private LocalDateTime entrada;
    private LocalDateTime saida;

    public RegistroPonto(LocalDateTime entrada, LocalDateTime saida) {
        this.entrada = entrada;
        this.saida = saida;
    }

    public LocalDateTime getEntrada() {
        return entrada;
    }

    public void setEntrada(LocalDateTime entrada) {
        this.entrada = entrada;
    }

    public LocalDateTime getSaida() {
        return saida;
    }

    public void setSaida(LocalDateTime saida) {
        this.saida = saida;
    }
}
