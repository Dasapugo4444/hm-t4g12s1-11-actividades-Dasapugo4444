package co.edu.sena.ejercicio2;

public abstract class Perro extends Mamifero {

    public final static int patas = 4;

    private String raza;

    @Override
    public void desplazarse() {
        System.out.println("");
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
}
