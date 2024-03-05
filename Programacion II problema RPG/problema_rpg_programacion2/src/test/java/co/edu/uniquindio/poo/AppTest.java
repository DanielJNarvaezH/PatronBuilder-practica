/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import java.util.List;
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
        DirectorPersonaje director1 = new DirectorPersonaje(builderM, builderA, builderG);
       

        // Construir un guerrero
        director.construct("Aragorn", "Guerrero", 10,
                List.of("Espada Afilada", "Golpe Definitivo", "Escudo Protector"),
                List.of("Espada", "Escudo"), "Héroe de Gondor", "El rey de los guerreros", 1000);
        Character warrior = builder.build();
        System.out.println("Guerrero creado: " + warrior);

        // Construir un mago
        builder = new MageBuilder();
        director = new CharacterDirector(builder);
        director.construct("Gandalf", "Mago", 15,
                List.of("Bola de Fuego", "Rayo Eléctrico", "Hechizo de Curación"),
                List.of("Báculo", "Túnica"), "El mago gris", "Gandalf el Blanco", 500);
        Character mage = builder.build();
        System.out.println("Mago creado: " + mage);

        // Construir un arquero
        builder = new ArcherBuilder();
        director = new CharacterDirector(builder);
        director.construct("Legolas", "Arquero", 12,
                List.of("Disparo Rápido", "Flecha Venenosa", "Tiro Certero"),
                List.of("Arco", "Flechas"), "El elfo de los bosques", "Príncipe de los arqueros", 800);
        Character archer = builder.build();
        System.out.println("Arquero creado: " + archer);
    }
}
}
