package org.example.validaciones;

import org.example.utilidades.Mensajes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioValidacionTest {
    //1. PREPARANDO
    //Probando el objeto UsuarioValidacion
    private UsuarioValidacion usuarioValidacion;

    @BeforeEach
    public void configuracionInicial(){
        this.usuarioValidacion = new UsuarioValidacion();
    }

    @Test
    public void validarNombreUsuarioCorrecto(){
        String nombreValido = "Carlos Alfredo Loaiza Molina"; //Preparando.
        //2 y 3, Ejeutar y verificar.
        Assertions.assertDoesNotThrow(()->usuarioValidacion.validarNombres(nombreValido));

    }
    @Test
    public void validarNombreUsuarioIncorrecto(){
        String nombreInvalido = "Carlos 1234 Loaiza Molina"; //Preparando.
        String nombreInvalidoTamano = "Carlos";

        Exception exception = Assertions.assertThrows(Exception.class,()->usuarioValidacion.validarNombres(nombreInvalido));
        Exception exception1 = Assertions.assertThrows(Exception.class,()->usuarioValidacion.validarNombres(nombreInvalidoTamano));

        Assertions.assertEquals(Mensajes.NOMBRE_SOLO_LETRAS.getMensaje(),exception.getMessage());
        Assertions.assertEquals(Mensajes.TAMANO_NOMBRE.getMensaje(),exception1.getMessage());
    }

    @Test
    void validarCorreoCorrecto() throws Exception{
        String correoCorrecto = "test@gmail.com";
        this.usuarioValidacion.validarCorreo(correoCorrecto);
        Assertions.assertDoesNotThrow(() -> this.usuarioValidacion.validarCorreo(correoCorrecto));
    }

    @Test
    void validarCorreoIncorrecto() {
        String correoIncorrecto = "testgmail.com";
        Exception exception = Assertions.assertThrows(Exception.class, () -> this.usuarioValidacion.validarCorreo(correoIncorrecto));
        Assertions.assertEquals(Mensajes.CORREO_INVALIDO.getMensaje(),exception.getMessage());
    }

    @Test
    void validarUbicacionCorrecta() {
        Integer ubicacionCorrecta = 1;
        Assertions.assertDoesNotThrow(() -> this.usuarioValidacion.validarUbicacion(ubicacionCorrecta));
    }

    @Test
    void validarUbicacionIncorrecta() {
        Integer ubicacionIncorrecta = 5;
        Exception exception = Assertions.assertThrows(Exception.class, () -> this.usuarioValidacion.validarUbicacion(ubicacionIncorrecta));
        Assertions.assertEquals(Mensajes.ZONA_INVALIDA.getMensaje(),exception.getMessage());
    }

}