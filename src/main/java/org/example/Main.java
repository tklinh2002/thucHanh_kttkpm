package org.example;

import org.example.adapter.AdapterResAndShip;
import org.example.adapter.service.Impl.RestaurantImpl;
import org.example.adapter.service.Impl.ShippingSystemImpl;
import org.example.adapter.service.Restaurant;
import org.example.decorator.Menu;
import org.example.decorator.MenuBasic;
import org.example.decorator.MenuChinese;
import org.example.decorator.MenuJapanese;
import org.example.facade.AudioFacade;

public class Main {
    public static void main(String[] args) {
        // chưa áp dụng pattern
        Restaurant restaurant = new RestaurantImpl();
        restaurant.sendShippingRequest("abc",1);
        // áp dụng pattern
        System.out.println("------------------------------------");
        System.out.println("use pattern");
        Restaurant restaurant2 = new AdapterResAndShip(new ShippingSystemImpl());
        restaurant2.sendShippingRequest("abc",1);

//        AudioFacade audioFacade = new AudioFacade();
//        audioFacade.turnOnAudio();
//        Menu menu = new MenuBasic();
//        menu.type();
//        System.out.println("------------------------------------");
//        Menu menuChina = new MenuChinese(menu);
//        menuChina.type();
//        System.out.println("------------------------------------");
//        Menu menuJapan = new MenuJapanese(menu);
//        menuJapan.type();
    }
}