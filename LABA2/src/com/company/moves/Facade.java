package com.company.moves;
import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {

    public Facade() {
        super(Type.NORMAL, 70, 100);
    }

    protected double calcBaseDamage(Pokemon var1, Pokemon var2) {
        if (var1.getCondition() == Status.BURN || var1.getCondition() == Status.PARALYZE || var1.getCondition() == Status.POISON) {
            return 2 * ((0.4D * (double) var1.getLevel() + 2.0D) * this.power / 150.0D);
        }
        return (0.4D * (double) var1.getLevel() + 2.0D) * this.power / 150.0D;
    }

    protected String describe() {
        return "использует Facade";
    }

}
