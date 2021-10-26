package com.company.moves;
import ru.ifmo.se.pokemon.*;

public class Shadow_Ball extends SpecialMove {

    public Shadow_Ball() {
        super(Type.GHOST, 80, 100);
    }

    protected void applyOppEffects(Pokemon pok) {
        Effect eff = new Effect().chance(0.2).turns(0).stat(Stat.SPECIAL_DEFENSE, -1);
        pok.addEffect(eff);
    }

    protected String describe() {
        return "использует Shadow Ball";
    }

}
