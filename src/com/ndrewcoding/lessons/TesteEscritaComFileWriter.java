package com.ndrewcoding.lessons;

import java.io.*;

public class TesteEscritaComFileWriter {
    public static void main(String[] args) throws IOException {

        OutputStream fileOutputStream = new FileOutputStream("generated.txt");
        Writer outputStreamWriter = new OutputStreamWriter(fileOutputStream);
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

        bufferedWriter.write("Primeira linha. Olá!");
        bufferedWriter.newLine();
        bufferedWriter.write("Segunda linha.");

        bufferedWriter.close();

    }
}
