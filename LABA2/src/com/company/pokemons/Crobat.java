package com.company.pokemons;
import com.company.moves.Dream_Eater;
import com.company.moves.Rock_Slide;
import com.company.moves.Shadow_Ball;
import com.company.moves.Stone_Edge;
import ru.ifmo.se.pokemon.*;

public class Crobat extends Pokemon {

    public Crobat(String name, int lvl) {

        super(name, lvl);

        setStats(85, 90, 80, 70, 80, 130);
        setType(Type.POISON, Type.FLYING);

        Shadow_Ball shadow_ball = new Shadow_Ball();
        this.addMove(shadow_ball);
        Rock_Slide rock_slide = new Rock_Slide();
        this.addMove(rock_slide);
        Stone_Edge stone_edge = new Stone_Edge();
        this.addMove(stone_edge);
        Dream_Eater dream_eater = new Dream_Eater();
        this.addMove(dream_eater);

    }
}
