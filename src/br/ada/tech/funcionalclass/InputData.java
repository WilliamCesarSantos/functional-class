package br.ada.tech.funcionalclass;

import java.util.Scanner;
import java.util.function.Function;

public class InputData<R> {

    private String title;
    private Function<String, R> converter;

    public InputData(String title, Function<String, R> converter) {
        this.title = title;
        this.converter = converter;
    }

    public R capture() {
        System.out.println(title);
        Scanner scanner = new Scanner(System.in);
        var text = scanner.nextLine();
        return converter.apply(text);
    }

}
