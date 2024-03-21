package br.ada.tech.funcionalclass;

@FunctionalInterface
public interface TriFunction<T, W, E, R> {

    R apply(T first, W second, E third);

}
