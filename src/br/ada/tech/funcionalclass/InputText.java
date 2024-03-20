package br.ada.tech.funcionalclass;

import java.util.Scanner;

public class InputText {

    public String capture() {
        System.out.println("Informe um texto");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }


}
