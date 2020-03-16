package com.example.gestorfinanceiro.entidades;

import java.util.ArrayList;

public class BancoUsuarios {

    private ArrayList<Usuario> bancoDeUsuarios = new ArrayList<>();



    public void addUsuario(String login, String senha, String cpf){
        bancoDeUsuarios.add(new Usuario(login, senha, cpf));
    }

    public Usuario getUser(String login){
        for (Usuario u: bancoDeUsuarios) {
            if (u.getLogin() == login) {
                return u;
            }
        }
        return null;
    }

    public boolean autentica(String login, String senha){
        for (Usuario u: bancoDeUsuarios) {
            if (u.getLogin() == login) {
                if (u.getSenha() == senha){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean checkUser(String login){
        for (Usuario u: bancoDeUsuarios) {
            if (u.getLogin() == login) {
                return true;
            }
        }
        return false;
    }

    public void debug(){
        for (Usuario u:bancoDeUsuarios) {
            System.out.println(u.getLogin());
        }
    }


}
