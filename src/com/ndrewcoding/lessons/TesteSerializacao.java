package com.ndrewcoding.lessons;

import java.io.*;

public class TesteSerializacao {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String nome = "Andrew Monteiro";

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
        objectOutputStream.writeObject(nome);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("objeto.bin"));
        String value = objectInputStream.readObject().toString();
        objectInputStream.close();

        System.out.println(value);

    }
}
