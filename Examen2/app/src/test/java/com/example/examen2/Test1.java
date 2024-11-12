package com.example.examen2;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class Test1 {

    @Test
    public void testConvertirNumeroBinario() {
        //Prueba para convertir un número binario a decimal
        String input = "1010";
        int base = 0;
        int resultadoEsperado = 10;
        int resultado = Calculadora.convertirNumero(input, base);

        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void testConvertirNumeroBaseInvalida() {
        //Prueba para una base no soportada
        String input = "1010";
        int base = 4;
        int resultadoEsperado = -1;
        int resultado = Calculadora.convertirNumero(input, base);

        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void testSuma() {
        //Prueba para la suma de dos números
        int num1 = 5;
        int num2 = 10;
        String operador = "+";
        int resultadoEsperado = 15;
        int resultado = Calculadora.realizarOperacion(num1, num2, operador);

        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void testDivisionPorCero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            Calculadora.realizarOperacion(5, 0, "/");
        });
        assertEquals("División por 0", exception.getMessage());
    }

    @Test
    public void testConvertirADestinoBinario() {
        String resultado = Calculadora.convertirADestino(10, 0);
        assertEquals("1010", resultado); // 10 en binario es 1010
    }

    @Test
    public void testConvertirADestinoOctal() {
        String resultado = Calculadora.convertirADestino(10, 1);
        assertEquals("12", resultado); // 10 en octal es 12
    }

    //Pruebas de metodo creado por Gabriel
    @Test
    public void testEncuentraNumeroPresente() {
        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5);
        boolean resultado = Calculadora.Encuentra(lista, 3);
        assertTrue(resultado); // El número 3 está presente en la lista
    }

    @Test
    public void testEncuentraNumeroNoPresente() {
        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5);
        boolean resultado = Calculadora.Encuentra(lista, 6);
        assertFalse(resultado); // El número 6 no está presente en la lista
    }

}
