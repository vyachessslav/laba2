package com.company.moves;
import ru.ifmo.se.pokemon.*;

public class Focus_Blast extends SpecialMove {

    public Focus_Blast() {
        super(Type.FIGHTING, 120, 70);
    }

    protected void applyOppEffects(Pokemon pok) {
        Effect eff = new Effect().chance(0.1).turns(0).stat(Stat.SPECIAL_DEFENSE, -1);
        pok.addEffect(eff);
    }

    protected String describe() {
        return "использует Focus Blast";
    }

}
