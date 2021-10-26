package com.company.moves;
import ru.ifmo.se.pokemon.*;

public class Rock_Slide extends PhysicalMove {

    public Rock_Slide() {
        super(Type.ROCK, 75, 90);
    }

    protected void applyOppEffects(Pokemon pok) {
        if (Math.random() > 0.3) {
            Effect.flinch(pok);
        }
    }

    protected String describe() {
        return "использует Rock Slide";
    }

}
