package com.acme;

import java.util.Scanner;

public class Message {
    public String solicitarDatos(String mensaje){
        System.out.println(mensaje);
        Scanner scn = new Scanner(System.in);
        return scn.nextLine();

    }

    public void saludar(Persona p) {
        System.out.printf("Hola %s, Bienvenido a Java \n", p);
    }
}
