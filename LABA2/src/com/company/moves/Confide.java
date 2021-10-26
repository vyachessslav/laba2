package com.company.moves;
import ru.ifmo.se.pokemon.*;

public class Confide extends StatusMove {

    public Confide() {
        super();
    }

    protected void applyOppEffects(Pokemon pok) {
        Effect eff = new Effect().turns(0).stat(Stat.SPECIAL_ATTACK, -1);
        pok.addEffect(eff);
    }

    protected String describe() {
        return "использует Confide";
    }

}
