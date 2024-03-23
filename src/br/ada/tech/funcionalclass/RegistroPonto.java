package br.ada.tech.funcionalclass;

import java.time.LocalDateTime;

public record RegistroPonto(
        LocalDateTime entrada,
        LocalDateTime saida,
        String nome
) {
}
/*
* public class RegistroPonto {
*    private LocalDateTime entrada;
*    private  LocalDateTime saida;
*
*    public RegistroPonto(LocalDateTime entrada, LocalDateTime saida) {
*       this.entrada = entrada;
*       this.saida = saida;
*    }
*
*    getters and setters
* }
* */
