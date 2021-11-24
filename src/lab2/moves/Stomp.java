package lab2.moves;

import ru.ifmo.se.pokemon.*;

public class Stomp extends PhysicalMove {
    public  Stomp() {
        super(Type.NORMAL, 65, 100);
    }

    @Override
    protected String describe(){
        return "топает";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon){
        if (Math.random() <= 0.3)
            Effect.flinch(pokemon);
    }
}
