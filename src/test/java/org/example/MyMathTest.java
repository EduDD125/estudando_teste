package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyMathTest {
    @Test
    @DisplayName("Test sum Doubles")
    void testDivisionByZero() {

        // contexto do text -  when
        MyMath sud = new MyMath();
        // ativação de métodos a ser testados - when
        int result = sud.sum(1.5, 2.5);
        // verificação - then
        Assertions.assertEquals(4, result);
    }
}