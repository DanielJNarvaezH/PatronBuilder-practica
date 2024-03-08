/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());
    @Test
        public void pruebaCreacionPersonajes() {
        LOG.info("Inicio del metodo pruebaCreacionPersonajes");
        VideojuegoRPG juego = new VideojuegoRPG("Diablo");
        Jugador j1 = new Jugador("Pepe");

       
        BuilderPersonaje builderM = new BuilderMago();
        BuilderPersonaje builderA = new BuilderArquero();
        BuilderPersonaje builderG = new BuilderGuerrero();

}
}