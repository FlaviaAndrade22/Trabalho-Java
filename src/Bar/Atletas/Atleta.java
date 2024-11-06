package Atletas;

public class Atleta {

    private String nome;
    private char sexo;
    private float altura;
    private float peso;

    public Atleta(String nome, char sexo, float altura, float peso){
        this.nome = nome;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNome(){
        return nome;
    }

    public char getSexo(){
        return sexo;
    }

    public float getAltura(){
        return altura;
    }

    public float getPeso(){
        return peso;
    }

}
