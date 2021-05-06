package Entities;

public class Quadrado {
    int lado;

    public Quadrado(int lado){
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Quadrado{" +
                "lado='" + lado + '\'' +
                '}';
    }
}