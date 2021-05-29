package com.whnm.javatest.player;

import org.junit.Test;
import org.mockito.Mockito;

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
        Dice dice = Mockito.mock(Dice.class);

        Mockito.when(dice.roll()).thenReturn(2);

        Player player = new Player(dice, 3);
        assertFalse(player.play());
    }

    @Test
    public void loosesWhenDiceNumberIsBig() {
        Dice dice = Mockito.mock(Dice.class);
        Mockito.when(dice.roll()).thenReturn(5);

        Player player = new Player(dice, 3);
        assertTrue(player.play());
    }
}