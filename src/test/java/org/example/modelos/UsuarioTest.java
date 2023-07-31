package org.example.modelos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {
    private Usuario usuario;

    @BeforeEach
    public void setUp(){this.usuario = new Usuario();}
    @Test
    public void setCorrectoNombres(){
        String nombreValido = "Carlos Alfredo Loaiza Molina"; //Prepararar
        this.usuario.setNombres(nombreValido); // Ejecutar
        Assertions.assertEquals(nombreValido,this.usuario.getNombres()); //Verificar
    }
    @Test
    public void setIncorrectoNombres(){
        String nombreInvalido = "Carlos 1234 Loaiza Molina"; //Prepararar
        this.usuario.setNombres(nombreInvalido);
        Assertions.assertNotEquals(nombreInvalido,this.usuario.getNombres());
    }

}