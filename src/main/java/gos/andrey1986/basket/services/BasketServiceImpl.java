package gos.andrey1986.basket.services;

import gos.andrey1986.basket.data.Basket;
import gos.andrey1986.basket.interfaces.BasketService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class BasketServiceImpl implements BasketService {

    private final Basket basket;

    public BasketServiceImpl(Basket basket) {
        this.basket = basket;
    }

    @Override
    public boolean addBasket(int id,String name) {
        basket.getGoodsBasket().put(id,name);
        return true;
    }

    @Override
    public Map getBasket() {
        return basket.getGoodsBasket();
    }
}
