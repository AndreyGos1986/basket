package gos.andrey1986.basket.interfaces;

import gos.andrey1986.basket.data.Basket;
import java.util.Map;

public interface BasketService {

    boolean addBasket(int id,String name);
    Map<Integer, String> getBasket();
}
