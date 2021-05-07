package test;

import Entities.Retangulo;
import org.junit.Assert;
import org.junit.Test;

public class Retangulo_spec {
    private Retangulo retangulo;
    private Retangulo retangulo2;

    @Test
    public void testMultiplasInstancias () {
        retangulo = Retangulo.getInstance(10, 5, 3);
        retangulo2 = Retangulo.getInstance(10, 2, 1);
        String expected = retangulo.toString();
        Assert.assertEquals(expected, retangulo2.toString());
    }
}
