package com.acme;

public record PersonaRegistro(String nombre, String apellidos) {
    @Override
    public String toString() {
        //Angel
        //Comenté esta linea porque tal vez se puede eliminar
        System.out.println("Instrucción de ejemplo");
        return "%s %s".formatted(nombre, apellidos);
    }
}
