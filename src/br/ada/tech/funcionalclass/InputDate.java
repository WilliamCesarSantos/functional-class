package br.ada.tech.funcionalclass;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class InputDate {

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public LocalDate capture() {
        System.out.println("Informe uma data(dd/MM/yyyy)");
        Scanner scanner = new Scanner(System.in);
        var text = scanner.nextLine();
        return LocalDate.parse(text, formatter);
    }

}
