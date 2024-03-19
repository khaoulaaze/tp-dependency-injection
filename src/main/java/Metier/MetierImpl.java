package Metier;


import Dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MetierImpl implements IMetier{
    //couplage faible

    @Autowired
    private IDao dao;
    @Override
    public double calcul() {
        double tmp=dao.getData();
        double result = tmp*540/Math.cos(tmp*Math.PI);
        return result;
    }

    public void setDao(IDao dao){
        this.dao = dao;
    }
}
