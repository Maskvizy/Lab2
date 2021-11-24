package lab2.pokemons;

import lab2.moves.*;

public class Luxray extends Luxio{
    public Luxray(String name, int level){
        super(name, level);

        setStats(80, 120, 79, 95, 79, 70);
        addMove(new Stomp());
    }
}
