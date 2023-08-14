package org.example.modelos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LocalTest {
    private Local local;

    @BeforeEach
    public void setUp() {
        this.local = new Local();
    }

    @Test
    public void setIdCorrecto() {
        Integer idCorrecto = Integer.valueOf("1234");
        this.local.setId(idCorrecto);
        Assertions.assertEquals(idCorrecto, this.local.getId());
    }

    @Test
    public void setNitCorrecto() {
        String nitCorrecto = "1234567890";
        this.local.setNit(nitCorrecto);
        Assertions.assertEquals(nitCorrecto, this.local.getNit());
    }
    @Test
    public void setNitIncorrecto() {
        String nitIncorrecto = "123456789";
        this.local.setNit(nitIncorrecto);
        Assertions.assertNotEquals(nitIncorrecto, this.local.getNit());
    }

    @Test
    public void setNombreCorrecto() {
        String nombreLocalCorrecto = "Un nombre valido para Local";
        this.local.setNombre(nombreLocalCorrecto);
        Assertions.assertEquals(nombreLocalCorrecto, this.local.getNombre());
    }
    @Test
    public void setNombreIncorrecto() {
        String nombreIncorrecto = "Nombre Invalido Nombre Invalido Nombre Invalido Nombre Invalido Nombre Invalido Nombre Invalido";
        this.local.setNombre(nombreIncorrecto);
        Assertions.assertNull(this.local.getNombre());
    }
}