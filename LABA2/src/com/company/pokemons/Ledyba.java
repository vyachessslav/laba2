package com.company.pokemons;
import com.company.moves.Boomburst;
import com.company.moves.Mud_Slap;
import com.company.moves.Rock_Slide;
import ru.ifmo.se.pokemon.*;

public class Ledyba extends Pokemon {

    public Ledyba(String name, int lvl) {

        super(name, lvl);

        setStats(40, 20, 30, 40, 80, 55);
        setType(Type.BUG, Type.FLYING);

        Mud_Slap mud_slap = new Mud_Slap();
        this.addMove(mud_slap);
        Rock_Slide rock_slide = new Rock_Slide();
        this.addMove(rock_slide);
        Boomburst boomburst = new Boomburst();
        this.addMove(boomburst);
    }
}
