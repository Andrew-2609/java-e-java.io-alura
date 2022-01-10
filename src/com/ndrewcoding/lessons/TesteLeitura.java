package com.ndrewcoding.lessons;

import java.io.*;

public class TesteLeitura {
    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream("lorem.txt");
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String linha = bufferedReader.readLine();

        System.out.println(linha);

        bufferedReader.close();

    }
}
