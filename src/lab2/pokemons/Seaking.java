package lab2.pokemons;

import lab2.moves.*;
import ru.ifmo.se.pokemon.*;

public class Seaking extends Goldeen{
    public Seaking(String name, int level){
        super(name, level);

        setType(Type.WATER);
        setStats(80, 92, 65, 65, 80, 68);
        addMove(new AquaJet());
    }
}
