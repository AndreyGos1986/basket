package gos.andrey1986.basket.data;

import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Repository
@SessionScope
public class Basket {
    private int id;
    private final Map<Integer, String> goodsBasket = new HashMap<>();


    public Map<Integer, String> getGoodsBasket() {
        return goodsBasket;
    }


    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Basket basket = (Basket) o;
        return id == basket.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
