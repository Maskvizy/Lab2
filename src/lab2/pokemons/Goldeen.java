package lab2.pokemons;

import lab2.moves.*;
import ru.ifmo.se.pokemon.*;

public class Goldeen extends Pokemon{
    public Goldeen(String name, int level){
        super(name, level);

        setType(Type.WATER);
        setStats(45, 67, 60, 35, 50, 63);
        setMove(new CalmMind(), new Psychic(), new Confide());
    }
}
