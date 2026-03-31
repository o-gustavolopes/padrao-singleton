package com.padrao.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DatabaseConnectTest {

    @Test
    public void deveRetornarConectado() {
        DatabaseConnect.getInstance().setNome("Banco 1");
        assertEquals("Banco 1", DatabaseConnect.getInstance().getNome());
    }

}