package gos.andrey1986.basket.controllers;

import gos.andrey1986.basket.data.Basket;
import gos.andrey1986.basket.services.BasketServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class BasketController {
    private final BasketServiceImpl basketService;

    public BasketController(BasketServiceImpl basketService) {
        this.basketService = basketService;
    }

    @RequestMapping("/add")
    public boolean addBasket(@RequestParam(name = "id") int id,
                             @RequestParam(name = "name") String name) {
        return basketService.addBasket(id,name);
    }

    @RequestMapping("/get")
    public Map<Integer,Basket> getBasket(){
        return basketService.getBasket();
    }

}
