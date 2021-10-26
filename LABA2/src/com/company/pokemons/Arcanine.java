package com.company.pokemons;
import com.company.moves.Confide;
import com.company.moves.Constrict;
import com.company.moves.Facade;
import ru.ifmo.se.pokemon.*;

public class Arcanine extends Pokemon {

    public Arcanine(String name, int lvl) {

        super(name, lvl);

        setStats(90, 110, 80, 100, 80, 95);
        setType(Type.FIRE);

        Constrict constrict = new Constrict();
        this.addMove(constrict);
        Facade facade = new Facade();
        this.addMove(facade);
        Confide confide = new Confide();
        this.addMove(confide);
    }
}
