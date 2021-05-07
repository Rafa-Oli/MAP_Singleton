package test;

import Entities.Equilatero;
import org.junit.Assert;
import org.junit.Test;

public class Equilatero_spec {
    private Equilatero equilatero;
    private Equilatero equilatero2;

    @Test
    public void testMultiplasInstancias () {
        equilatero = Equilatero.getInstance(10, 5, 3);
        equilatero2 = Equilatero.getInstance(10, 2, 1);
        String expected = equilatero.toString();
        Assert.assertEquals(expected, equilatero2.toString());
    }
}
