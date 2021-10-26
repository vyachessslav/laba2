package com.company.moves;
import ru.ifmo.se.pokemon.*;

public class Stone_Edge extends PhysicalMove {

    public Stone_Edge() {
        super(Type.ROCK, 100, 80);
    }

    protected double calcCriticalHit(Pokemon var1, Pokemon var2) {
        if (var1.getStat(Stat.SPEED) / 512.0D > Math.random() / 3.0) {
            System.out.println("Критический удар!");
            return 2.0D;
        } else {
            return 1.0D;
        }
    }

    protected String describe() {
        return "использует Stone Edge";
    }

}
