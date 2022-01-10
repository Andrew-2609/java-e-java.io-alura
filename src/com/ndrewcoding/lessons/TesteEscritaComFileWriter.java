package com.ndrewcoding.lessons;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaComFileWriter {
    public static void main(String[] args) throws IOException {

        FileWriter fileWriter = new FileWriter("generated.txt");

        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("Primeira linha com FIleWriter e BufferedWriter. Olá!");
        bufferedWriter.newLine();
        bufferedWriter.write("Segunda linha com FIleWriter e BufferedWriter.");

        bufferedWriter.close();

    }
}
