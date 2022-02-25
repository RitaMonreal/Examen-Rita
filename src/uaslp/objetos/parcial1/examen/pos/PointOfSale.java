package uaslp.objetos.parcial1.examen.pos;

import java.util.ArrayList;

public class PointOfSale {
    private ArrayList Products;
    private float Total;
    private String CountByName;

    public void addToCart(int quantity, Product product){

    }

    public float getTotal(){
        return Total;
    }

    public ArrayList getProducts(){
        return Products;
    }

    public String getCountByName(String name){
        return CountByName;
    }
}
