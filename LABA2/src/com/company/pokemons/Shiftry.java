package com.company.pokemons;
import com.company.moves.Confide;
import com.company.moves.Constrict;
import com.company.moves.Facade;
import com.company.moves.Focus_Blast;
import ru.ifmo.se.pokemon.*;

public class Shiftry extends Pokemon {

    public Shiftry(String name, int lvl) {

        super(name, lvl);

        setStats(90, 100, 60, 90, 60, 80);
        setType(Type.GRASS, Type.DARK);

        Constrict constrict = new Constrict();
        this.addMove(constrict);
        Facade facade = new Facade();
        this.addMove(facade);
        Confide confide = new Confide();
        this.addMove(confide);
        Focus_Blast focus_blast = new Focus_Blast();
        this.addMove(focus_blast);
    }
}
