package Entities;

public class Isosceles {

    private static Isosceles instance;
    int lado1, lado2, lado3;

    private Isosceles(int lado1, int lado2, int lado3){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public static Isosceles getInstance(int lado1, int lado2, int lado3) {
        if (instance == null) {
            instance = new Isosceles(lado1, lado2, lado3);
        }
        return instance;
    }

    @Override
    public String toString() {
        return "Isosceles{ " +
                "Tamado do lado 1 = " + lado1 +
                ",Tamanho do lado 2 = " + lado2 +
                ", Tamanho do lado 3 = " + lado3 +
                '}';
    }
}
