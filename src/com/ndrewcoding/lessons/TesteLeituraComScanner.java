package com.ndrewcoding.lessons;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TesteLeituraComScanner {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File("contas.csv"));

        while (scanner.hasNextLine()) {
            String linha = scanner.nextLine();

            Scanner linhaScanner = new Scanner(linha);
            linhaScanner.useDelimiter(",");

            while (linhaScanner.hasNextLine()) {
                String valor = linhaScanner.next();
                System.out.print(valor);
            }

            System.out.println();

            linhaScanner.close();
        }

        scanner.close();

    }
}
