package Entities;

public class Retangulo {

    private static Retangulo instance;
    int lado1, lado2, lado3;

    private Retangulo(int lado1, int lado2, int lado3){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public static Retangulo getInstance(int lado1, int lado2, int lado3) {
        if (instance == null) {
            instance = new Retangulo(lado1, lado2, lado3);
        }
        return instance;
    }

    @Override
    public String toString() {
        return "Retangulo{ " +
                "Tamado do lado 1 = " + lado1 +
                ",Tamanho do lado 2 = " + lado2 +
                ", Tamanho do lado 3 = " + lado3 +
                '}';
    }
}
