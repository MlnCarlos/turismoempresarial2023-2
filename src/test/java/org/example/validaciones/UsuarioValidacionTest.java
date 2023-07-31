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
        Exception exception = Assertions.assertThrows(Exception.class,()->usuarioValidacion.validarNombres(nombreInvalido));
        Assertions.assertEquals(Mensajes.NOMBRE_SOLO_LETRAS.getMensaje(),exception.getMessage());
    }




}