package com.company.moves;
import ru.ifmo.se.pokemon.*;

public class Constrict extends PhysicalMove {

    public Constrict() {
        super(Type.NORMAL, 10, 100);
    }

    protected void applyOppEffects(Pokemon pok) {
        Effect eff = new Effect().chance(0.1).turns(0).stat(Stat.SPEED, -1);
        pok.addEffect(eff);
    }

    protected String describe() {
        return "использует Constrict";
    }

}
