package com.company.moves;
import ru.ifmo.se.pokemon.*;

public class Dream_Eater extends SpecialMove {

    public Dream_Eater() {
        super(Type.PSYCHIC, 100, 100);
    }

    protected double calcBaseDamage(Pokemon var1, Pokemon var2) {
        if (var2.getCondition() == Status.SLEEP) {
            return (0.4D * (double) var1.getLevel() + 2.0D) * this.power / 150.0D;
        }
        return 0;
    }

    protected void applySelfEffects(Pokemon p) {
        int hp = (int) ((p.getStat(Stat.HP) - p.getHP()) / 2);
        p.setMod(Stat.HP,hp);
        System.out.printf("Покемон %s лечится на %s здоровья\n", p, hp);
    }

    protected String describe() {
        return "использует Dream_Eater";
    }

}
