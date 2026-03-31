package com.padrao.singleton;

public class DatabaseConnect {

    private String nome;

    private DatabaseConnect() {

    }

    private static DatabaseConnect instance = new DatabaseConnect();

    public static DatabaseConnect getInstance() {
        return instance;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static void setInstance(DatabaseConnect instance) {
        DatabaseConnect.instance = instance;
    }
}
