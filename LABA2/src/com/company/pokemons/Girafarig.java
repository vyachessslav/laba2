package com.company.pokemons;
import com.company.moves.Boomburst;
import com.company.moves.Dragon_Rush;
import com.company.moves.Mud_Slap;
import com.company.moves.Rock_Slide;
import ru.ifmo.se.pokemon.*;

public class Girafarig extends Pokemon {

    public Girafarig(String name, int lvl) {

        super(name, lvl);

        setStats(70, 80, 65, 90, 65, 85);
        setType(Type.NORMAL, Type.PSYCHIC);

        Mud_Slap mud_slap = new Mud_Slap();
        this.addMove(mud_slap);
        Rock_Slide rock_slide = new Rock_Slide();
        this.addMove(rock_slide);
        Boomburst boomburst = new Boomburst();
        this.addMove(boomburst);
        Dragon_Rush dragon_rush = new Dragon_Rush();
        this.addMove(dragon_rush);
    }
}
