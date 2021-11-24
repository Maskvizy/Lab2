package lab2.moves;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public Rest() {
        super(Type.PSYCHIC, 90, 100);
    }

    @Override
    protected String describe(){
        return "отдыхает";
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon){
        Effect.sleep(pokemon);
    }
}
