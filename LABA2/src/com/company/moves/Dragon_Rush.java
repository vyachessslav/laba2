package com.company.moves;
import ru.ifmo.se.pokemon.*;

public class Dragon_Rush extends PhysicalMove {

    public Dragon_Rush() {
        super(Type.DRAGON, 100, 75);
    }

    protected void applyOppEffects(Pokemon pok) {
        if (Math.random() > 0.2) {
            Effect.flinch(pok);
        }
    }

    protected String describe() {
        return "использует Dragon Rush";
    }

}
