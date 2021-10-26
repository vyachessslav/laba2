package com.company;
import com.company.pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Main {

    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Crobat("Василий", 1);
        Pokemon p2 = new Arcanine("Александр", 1);
        Pokemon p3 = new Ledyba("Святослав", 1);
        Pokemon p4 = new Shiftry("Артемий", 1);
        Pokemon p5 = new Girafarig("Архип", 1);
        Pokemon p6 = new Wobbuffet("Олег", 1);
        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();
    }
}
