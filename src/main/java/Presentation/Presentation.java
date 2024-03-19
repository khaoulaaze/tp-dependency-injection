package Presentation;

import Dao.DaoImpl;
import Metier.MetierImpl;

public class Presentation {
    public static void main (String[] args) {

        //instanciation statique
        DaoImpl dao = new DaoImpl();
        MetierImpl metier = new MetierImpl();
        metier.setDao(dao);
    }
}
