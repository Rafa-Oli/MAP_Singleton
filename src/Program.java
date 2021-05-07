import Entities.*;

public class Program {
    public static void main(String[] args) {
        Circulo circulo = Circulo.getInstance(2);
        System.out.println(circulo.toString());
        Circulo circulo1 = Circulo.getInstance(1);
        System.out.println(circulo1);

        Quadrado quadrado1 = new Quadrado(3);
        System.out.println(quadrado1.toString());

        Quadrado quadrado2 = new Quadrado(10);
        System.out.println(quadrado2.toString());

        Quadrado quadrado3 = new Quadrado(5);
        System.out.println(quadrado3.toString());

        Equilatero equilatero = Equilatero.getInstance(2,3,4);
        System.out.println(equilatero.toString());

        Isosceles isosceles = Isosceles.getInstance(90,50,30);
        System.out.println(isosceles.toString());

        Retangulo retangulo = Retangulo.getInstance(40, 30,20);
        System.out.println(retangulo.toString());
    }
}
