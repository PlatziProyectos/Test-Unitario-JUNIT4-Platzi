package com.whnm.javatest.player;

import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void loosesWhenDiceNumberIsTooLow() {
        /*
         * En la Clase Dice se esta generando un numero aleatorio
         * por lo tanto no es correcto el test unitario pues
         * varia por cada ejecución.
         * Aquí es un escenario donde se debe utilizar Mockito
         */
        Dice dice = new Dice(6);
        Player player = new Player(dice, 2);
        assertEquals(false, player.play());
    }
}