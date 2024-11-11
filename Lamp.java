package Lampada;

public class Lamp {

    private String cor;
    private String marca;
    private String modelo;
    private int volts;
    private String tipo;
    private String garantia;
    private double preço;
    private boolean ligada;

    public Lamp (cor, marca, modelo, volts, tipo, garantia, preço){
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
        this.volts = volts;
        this.tipo = tipo;
        this.garantia = garantia;
        this.preço = preço;
        this.ligada = false;
    }

    public String getCor(){
        return cor;
    }

    public void setCor(String cor){
        this.cor = cor; 
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public int getVolts(){
        return volts;
    }

    public void setVolts(int volts){
        this.volts = volts
    }

    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getGarantia(){
        return garantia;
    }

    public void setGarantia(String garantia){
        this.garantia = garantia
    }

    public double getPreço(){
        return preço;
    }

    public void setPreço(double preço){
        this.preço = preço;
    }

    public boolean getLigada(){
        return ligada;
    }

    public void setLigada(boolean ligada){
        this.ligada = ligada;
    }

    public void ligar() {
        this.ligada = true;
        System.out.println("# Lâmpada Ligada #");
    }

    public void desligar() {
        this.ligada = false;
        System.out.println("# Lâmpada Desligada #");
    }

    public void mostrarStatus() {
        String status = ligada ? "Ligada" : "Desligada";
        System.out.println("STATUS: " + status);
    }

    public void mudarStatus() {
        if (ligada) {
            desligar();
        } else {
            ligar();
        }
    }
}
