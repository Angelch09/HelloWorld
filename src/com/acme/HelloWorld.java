package com.acme;

public class HelloWorld {
    public static void main(String[] args) {
        Message msg = new Message();
        String nombre = msg.solicitarDatos("Escribe tu nombre: ");
        String apellidos = msg.solicitarDatos("Escribe tus apellidos: ");

        Persona p1 = new Persona(nombre, apellidos);
        msg.saludar(p1);

    }
}
