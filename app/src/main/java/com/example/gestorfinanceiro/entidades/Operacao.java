package com.example.gestorfinanceiro.entidades;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.example.gestorfinanceiro.excecoes.InvalidOperacaoException;
import com.example.gestorfinanceiro.excecoes.InvalidUserException;

import java.io.Serializable;

@Entity(tableName = "operacoes")
public class Operacao implements Serializable {
    @PrimaryKey(autoGenerate = true)
    private Integer id = null;
    private Integer valor;
    private String descricao;
    private Integer userOwnerId;
    private Integer mes;

    public Operacao(Integer valor, String descricao, Integer userOwnerId, Integer mes) {
        if(descricao.length() > 60){
            throw new InvalidOperacaoException("A descrição deve ter menos de 60 caracteres");
        }
        this.valor = valor;
        this.descricao = descricao;
        this.userOwnerId = userOwnerId;
        this.mes = mes;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserOwnerId() {
        return userOwnerId;
    }

    public void setUserOwnerId(Integer userOwnerId) {
        this.userOwnerId = userOwnerId;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }
}
