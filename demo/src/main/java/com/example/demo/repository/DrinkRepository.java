package com.example.demo.repository;
import com.example.demo.Drink;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DrinkRepository extends JpaRepository<Drink,Long> {
//    @Query("")
//    List<Drink>findDrinkByPriceGreaterThan(int price);
}
