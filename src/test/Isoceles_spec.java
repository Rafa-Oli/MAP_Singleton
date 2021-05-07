package test;

import Entities.Isosceles;
import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

public class Isoceles_spec {
    private Isosceles isosceles;
    private Isosceles isosceles2;

    @Test
    public void testMultiplasInstancias () {
        isosceles = Isosceles.getInstance(10, 10, 2);
        isosceles2 = Isosceles.getInstance(10, 3, 10);
        String expected = isosceles.toString();
        Assert.assertEquals(expected, isosceles2.toString());
    }
}
