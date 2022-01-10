package com.ndrewcoding.lessons;

import java.io.*;

public class TesteEscrita {
    public static void main(String[] args) throws IOException {

        FileOutputStream fileOutputStream = new FileOutputStream("generated.txt");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

        bufferedWriter.write("Primeira linha. Olá!");
        bufferedWriter.newLine();
        bufferedWriter.write("Segunda linha.");

        bufferedWriter.close();

    }
}
