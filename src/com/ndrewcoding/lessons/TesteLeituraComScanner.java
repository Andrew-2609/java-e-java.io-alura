package com.ndrewcoding.lessons;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeituraComScanner {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File("contas.csv"));

        while (scanner.hasNextLine()) {
            String linha = scanner.nextLine();

            Scanner linhaScanner = new Scanner(linha);
            linhaScanner.useDelimiter(",");
            linhaScanner.useLocale(Locale.US);

            String tipoDeConta = linhaScanner.next();
            int agencia = linhaScanner.nextInt();
            int numero = linhaScanner.nextInt();
            String titular = linhaScanner.next();
            double saldo = linhaScanner.nextDouble();

            System.out.format(
                    new Locale("pt", "BR"),
                    "%nTipo de conta: %s\nAgência: %d; Número: %d\nTitular: %s\nSaldo: %.2f%n",
                    tipoDeConta, agencia, numero, titular, saldo
            );

            linhaScanner.close();
        }

        scanner.close();

    }
}
