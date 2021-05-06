package Entities;
public class Circulo {
    private static Circulo instance;
    int raio;

    private Circulo(int raio){
        this.raio = raio;
    }

    public static Circulo getInstance(int raio) {
        if (instance == null) {
            instance = new Circulo(raio);
        }
        return instance;
    }
    @Override
    public String toString() {
        return "Circulo{" +
                "raio='" + raio + '\'' +
                '}';
    }
}
