package com.company.moves;
import ru.ifmo.se.pokemon.*;

public class Mud_Slap extends PhysicalMove {

    public Mud_Slap() {
        super(Type.GROUND, 20, 100);
    }

    protected void applyOppEffects(Pokemon pok) {
        Effect eff = new Effect().turns(0).stat(Stat.ACCURACY, -1);
        pok.addEffect(eff);
    }

    protected String describe() {
        return "использует Mud-Slap";
    }

}
