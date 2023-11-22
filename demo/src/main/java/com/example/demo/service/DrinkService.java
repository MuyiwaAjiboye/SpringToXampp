package com.example.demo.service;
import com.example.demo.Drink;
import java.util.List;
public interface DrinkService {
    Drink saveDrink(Drink drink);
    Drink getDrinkById(long Id);
    List<Drink> getAllDrink();
    Drink updateDrink(Drink drink);
    void deleteDrink(long Id);

}
