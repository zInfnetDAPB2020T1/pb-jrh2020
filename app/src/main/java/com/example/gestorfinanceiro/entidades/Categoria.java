package com.example.gestorfinanceiro.entidades;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import com.example.gestorfinanceiro.excecoes.InvalidCategoriaException;

import java.io.Serializable;

@Entity(tableName = "categorias")
public class Categoria implements Serializable {
    @PrimaryKey(autoGenerate = true)
    private Integer id = null;
    private String nome;
    @Ignore
    private Operacoes operacoes = new Operacoes();
    private Boolean status;
    private Integer mes;


    public Categoria(String nome, Boolean status, Integer mes) {
        if(nome.length() > 15){
            throw new InvalidCategoriaException("Limite de 15 caracteres excedido");
        }
        if(mes < 0 || mes > 11){
            throw new InvalidCategoriaException("Mes invalido, use 0-11 (0jan-11dez)");
        }
        this.nome = nome;
        this.status = status;
        this.mes = mes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Operacoes getOperacoes() {
        return operacoes;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }
}
