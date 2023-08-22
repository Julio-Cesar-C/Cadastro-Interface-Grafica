/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author NFC
 */
public class Aluno {

    private String nome;
    private String RA;
    private int idade;
    private String telefone;

    public Aluno(String nome, String RA, int idade, String telefone) {
        this.nome = nome;
        this.RA = RA;
        this.idade = idade;
        this.telefone = telefone;

    }

    public Aluno() {
      
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRA() {
        return RA;
    }

    public void setRA(String RA) {
        this.RA = RA;
    }

   

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

   

}
