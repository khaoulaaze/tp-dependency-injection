package Presentation;

import Dao.IDao;
import Metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class presentation1 {
    //FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException
    public static void main (String[] args) throws Exception {
        //instanciation dynamique
        Scanner scanner = new Scanner(new File("config.txt"));

        String daoClassName= scanner.nextLine();
        Class<?> cDao= Class.forName(daoClassName);
        IDao dao = (IDao) cDao.newInstance();

        String metierClassName= scanner.nextLine();
        Class<?> cMetier= Class.forName(metierClassName);
        IMetier metier = (IMetier) cMetier.newInstance();

        //appel methode d'une façon dynamique
        Method method = cMetier.getMethod("setDao", IDao.class );

        //metier.setDao(dao) <==> method.invoke(metier,dao);
        method.invoke(metier,dao);
    }
}
