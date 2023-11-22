package com.example.demo.repository;
import com.example.demo.Drink;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DrinkRepository extends JpaRepository<Drink,Long> {
//    @Query("")
//    List<Drink>findDrinkByPriceGreaterThan(int price);
}
