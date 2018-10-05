package co.edu.sena.ejercicio01;

public class Gafas {

    private String marca;
    private float precio;
    private String color;
    private float groso;
    private String estilo;

    public Gafas(){

    }

    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca=marca;
    }
    public float getPrecio(){
        return precio;
    }
    public void setPrecio(float precio){
        this.precio=precio;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color ){
        this.color=color;
    }
    public float getGroso(){
        return groso;
    }
    public void getGroso(float groso){
        this.groso=groso;
    }
    public String getEstilo(){
        return estilo;
    }
    public void setEstilo(String estilo){
        this.estilo=estilo;
    }
}