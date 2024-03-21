package br.ada.tech.funcionalclass;

public class MainCalculadora {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        var result = calculadora.executaOperacao();
        System.out.println(result);
    }

}
