package lab2.pokemons;

import lab2.moves.*;
import ru.ifmo.se.pokemon.*;

public class Shinx extends Pokemon {
    public Shinx(String name, int level){
        super(name, level);

        setType(Type.ELECTRIC);
        setStats(45, 65, 34, 40, 34, 45);
        setMove(new Confide(), new Bulldoze());
    }
}
