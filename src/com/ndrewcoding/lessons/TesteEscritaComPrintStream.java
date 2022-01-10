package com.ndrewcoding.lessons;

import java.io.IOException;
import java.io.PrintStream;

public class TesteEscritaComPrintStream {
    public static void main(String[] args) throws IOException {

        PrintStream printStream = new PrintStream("generated.txt");
        printStream.println("Primeira linha com PrintStream. Olá!");
        printStream.println();
        printStream.println("Segunda linha com PrintStream.");

        printStream.close();

    }
}
