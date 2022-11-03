package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathClassTest{

    @Test
    void test_add(){
        assertEquals(5,MathClass.add(3,2));
    }

    @Test
    void test_sub(){
        assertEquals(1,MathClass.sub(3,2));
    }

    @Test
    void test_mul(){
        assertEquals(15,MathClass.mul(3,5));
    }

    @Test
    void test_isEven(){
        assertTrue(MathClass.isPrime(13));
    }

    @Test
    void test_divide(){
        assertEquals(5,MathClass.devide(25,5));
    }

    @Test
    void test_Prime(){
        assertTrue(MathClass.isPrime(13));
    }

}