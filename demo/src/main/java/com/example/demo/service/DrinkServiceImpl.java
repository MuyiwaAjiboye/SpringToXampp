package com.example.demo.service;
import com.example.demo.Drink;
import java.util.List;
import java.util.Optional;

import com.example.demo.repository.DrinkRepository;
import com.example.demo.service.DrinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DrinkServiceImpl implements DrinkService{
    @Autowired
    DrinkRepository drinkRepository;
    @Override
    public Drink saveDrink(Drink drink) {
        return drinkRepository.save(drink);
    }

    @Override
    public Drink getDrinkById(long Id) {
        Optional<Drink> drink = drinkRepository.findById(Id); // has it's present and it's null
        Drink emptyDrink = null;
        if (drink.isPresent()){
            emptyDrink = drink.get();
            return emptyDrink;
        }else{
            throw new RuntimeException("Drink not found");
        }

    }

    @Override
    public List<Drink> getAllDrink() {
        return drinkRepository.findAll();
    }

    @Override
    public Drink updateDrink(Drink drink) {
        Optional<Drink> optionaldrink = drinkRepository.findById(drink.getId());
        if (optionaldrink.isPresent()){
            Drink updateDrink = new Drink();
            updateDrink.setCapacity(drink.getCapacity());
            updateDrink.setColour(drink.getColour());
            updateDrink.setCompany(drink.getCompany());
            updateDrink.setName(drink.getName());
            updateDrink.setIngredients(drink.getIngredients());
            updateDrink.setPrice(drink.getPrice());
            updateDrink.setId(drink.getId());
            updateDrink.setType(drink.getType());

            drinkRepository.save(updateDrink);
        }else{
            throw new RuntimeException("Drink does not exist");
        }
        return null;
    }

    @Override
    public void deleteDrink(long Id) {

    }
}
