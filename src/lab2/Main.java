package lab2;

import lab2.pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Main {

    public static void main(String[] args) {
        Battle b = new Battle();

        Shinx shinx = new Shinx("Шинкс", 1);
        Luxray luxray = new Luxray("Люксрей", 1);
        Luxio luxio = new Luxio("Люксио", 1);
        Goldeen goldeen = new Goldeen("Гольдин", 1);
        Rayquaza rayquaza = new Rayquaza("Рэйкваза", 1);
        Seaking seaking = new Seaking("Сиакинг", 1);

        b.addAlly(seaking);
        b.addAlly(rayquaza);
        b.addAlly(shinx);

        b.addFoe(luxio);
        b.addFoe(luxray);
        b.addFoe(goldeen);

        b.go();
    }
}
