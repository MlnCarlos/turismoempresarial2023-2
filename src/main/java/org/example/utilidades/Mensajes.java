package org.example.utilidades;

public enum Mensajes {

    NOMBRE_SOLO_LETRAS("El nombre de usuario solo debe contener letras"),
    TAMANO_NOMBRE("El nombre debe de tener minimo 10 caracterés "),
    CORREO_INVALIDO("Correo ingresado no es valido"),
    ZONA_INVALIDA("La zona ingresada no es valida");

    private String mensaje;

    Mensajes(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }
}
