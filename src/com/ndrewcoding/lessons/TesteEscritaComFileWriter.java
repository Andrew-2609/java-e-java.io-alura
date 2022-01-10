package com.ndrewcoding.lessons;

import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaComFileWriter {
    public static void main(String[] args) throws IOException {

        FileWriter fileWriter = new FileWriter("generated.txt");

        fileWriter.write("Primeira linha com FIleWriter. Olá!");
        fileWriter.write("\n");
        fileWriter.write("Segunda linha com FIleWriter.");

        fileWriter.close();

    }
}
