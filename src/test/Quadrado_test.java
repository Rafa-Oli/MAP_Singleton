package test;

import Entities.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Quadrado_test {
    private Quadrado quadrado;
    private Quadrado quadrado2;
    private Quadrado quadrado3;

    @Before
    public void Instances () {
        quadrado = new Quadrado(1);
        quadrado2 = new Quadrado(2);
        quadrado3 = new Quadrado(3);
    }
    @Test
    public void testVariasInstancias () {
        boolean result;
        result = (quadrado.toString().equals(quadrado2.toString()) && quadrado.toString().equals(quadrado3.toString()));
        Assert.assertFalse(result);
    }
}
