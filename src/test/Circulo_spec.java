package test;

import Entities.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Circulo_spec {
    private Circulo circulo;
    private Circulo circulo2;

    @Test
    public void testInstanciaMultipla () {
        circulo = Circulo.getInstance(2);
        circulo2 = Circulo.getInstance(1);
        String expected = circulo.toString();
        Assert.assertEquals(expected, circulo2.toString());
    }

}
