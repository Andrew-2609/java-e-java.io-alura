package com.ndrewcoding.lessons;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class TesteLeitura {
    public static void main(String[] args) throws IOException {

        InputStream fileInputStream = new FileInputStream("lorem.txt");
        Reader inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String linha = bufferedReader.readLine();

        while (linha != null) {
            System.out.println(linha);
            linha = bufferedReader.readLine();
        }


        bufferedReader.close();

    }
}
