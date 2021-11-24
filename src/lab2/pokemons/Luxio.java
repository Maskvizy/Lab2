package lab2.pokemons;

import lab2.moves.*;

public class Luxio extends Shinx {
    public Luxio(String name, int level){
        super(name, level);

        setStats(60, 85, 49, 60, 49, 60);
        addMove(new RockSlide());
    }
}
