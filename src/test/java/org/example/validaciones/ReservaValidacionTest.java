package org.example.validaciones;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservaValidacionTest {
    ReservaValidacion reservaValidacion;

    @BeforeEach
    void setUp() {
        this.reservaValidacion = new ReservaValidacion();
    }

    @Test
    void validarFechaReservaCorrecta() throws Exception{
        String fechaReservaCorrecta = "14/08/2023";
        this.reservaValidacion.validarFechaReserva(fechaReservaCorrecta);
        Assertions.assertDoesNotThrow(() -> this.reservaValidacion.validarFechaReserva(fechaReservaCorrecta));
    }

    @Test
    void validarFechaReservaIncorrecta() {
        String fechaReservaIncorrecta = "2023/08/14";
        Exception exception = Assertions.assertThrows(Exception.class, () -> this.reservaValidacion.validarFechaReserva(fechaReservaIncorrecta));
        Assertions.assertEquals("El formato de fecha debe de ser DD/MM/YYY",exception.getMessage());
    }

    @Test
    void validarNumeroReservaCorrecto() throws Exception{
        Integer numeroReservasCorrectas = 3;
        this.reservaValidacion.validarNumeroReserva(numeroReservasCorrectas);
        Assertions.assertDoesNotThrow(() -> this.reservaValidacion.validarNumeroReserva(numeroReservasCorrectas));
    }

    @Test
    void validarNumeroReservaIncorrecta() {
        Integer numeroReservasIncorrectas = 5;
        Exception exception = Assertions.assertThrows(Exception.class, () -> this.reservaValidacion.validarNumeroReserva(numeroReservasIncorrectas));
        Assertions.assertEquals("La cantidad maxima por reserva es de 4 personas",exception.getMessage());
    }
}