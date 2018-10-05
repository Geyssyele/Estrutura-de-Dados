/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aluno;

/**
 *
 * @author 20171TINF0137
 */
public class Aluno {
     private long matricula;
    private String nome;
    private int idade;
    private String disciplina;
    private double[] notas;
    private int quantNotasAtribuidas;

    public double[] visualizarNotas() {
        return this.notas;
    }

    public double media() {
        double soma = 0;
        for (int i = 0; i < this.notas.length; i++) {
            soma += this.notas[i];
        }

        return arredondarDuasCasas(soma / this.notas.length);
    }

    public void atribuirNota(double nota) throws IllegalArgumentException {
        if (quantNotasAtribuidas < getQuantidadeMaximaNotas()) {
            if (nota >= getNotaMinimaPermitida() && nota <= getNotaMaximaPermitida()) {
                this.notas[this.quantNotasAtribuidas] = arredondarDuasCasas(nota);
                this.quantNotasAtribuidas++;
            } else {
                throw new IllegalArgumentException("Nota fora dos padroes de minima ou maxima, verifique");
            }
        }
    }

    public void mudarIdadePara(int novaIdade) {
        if (novaIdade < getIdadeMinima()) {
            throw new IllegalArgumentException("A idade minima permitida no sistema é " + getIdadeMinima());
        }
        this.idade = novaIdade;
    }

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.notas = new double[getQuantidadeMaximaNotas()];
        this.mudarIdadePara(idade);
        this.quantNotasAtribuidas = 0;
    }

    public int getQuantidadeNotasAtribuidas() {
        return this.quantNotasAtribuidas;
    }

    public String getNome() {
        return this.nome;
}

    private double arredondarDuasCasas(double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private int getQuantidadeMaximaNotas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private double getNotaMinimaPermitida() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private double getNotaMaximaPermitida() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private int getIdadeMinima() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
