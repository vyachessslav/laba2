package com.company.pokemons;
import com.company.moves.Mud_Slap;
import com.company.moves.Rock_Slide;
import ru.ifmo.se.pokemon.*;

public class Wobbuffet extends Pokemon {

    public Wobbuffet(String name, int lvl) {

        super(name, lvl);

        setStats(190, 33, 58, 33, 58, 33);
        setType(Type.PSYCHIC);

        Mud_Slap mud_slap = new Mud_Slap();
        this.addMove(mud_slap);
        Rock_Slide rock_slide = new Rock_Slide();
        this.addMove(rock_slide);
    }
}
