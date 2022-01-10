package com.ndrewcoding.lessons;

import java.io.*;

public class TesteCopiarArquivo {
    public static void main(String[] args) throws IOException {

        InputStream fileInputStream = new FileInputStream("lorem.txt");
        Reader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        FileOutputStream fileOutputStream = new FileOutputStream("lorem_copied.txt");
        Writer outputStreamWriter = new OutputStreamWriter(fileOutputStream);
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

        String linha = bufferedReader.readLine();

        while (linha != null) {
            bufferedWriter.write(linha);
            bufferedWriter.newLine();
            linha = bufferedReader.readLine();
        }

        bufferedReader.close();
        bufferedWriter.close();

    }
}
