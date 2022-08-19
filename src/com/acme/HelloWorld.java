package com.acme;

public class HelloWorld {
    public static void main(String[] args) {
        Message msg = new Message();
        String nombre = msg.solicitarDatos("Escribe tu nombre");
        msg.saludar(nombre);


    }
}
