package com.acme;

public record PersonaRegistro(String nombre, String apellidos) {
    @Override
    public String toString() {
        System.out.println("Instrucción de ejemplo");
        return "%s %s".formatted(nombre, apellidos);
    }
}
