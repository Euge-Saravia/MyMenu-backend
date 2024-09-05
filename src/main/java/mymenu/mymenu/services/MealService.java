package mymenu.mymenu.services;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import mymenu.mymenu.models.Meal;
import mymenu.mymenu.repositories.MealRepository;

@Service
public class MealService {

    private MealRepository mealRepository;

    public MealService(MealRepository mealRepository) {
        this.mealRepository = mealRepository;
    }

    public ResponseEntity<Object> createMeal(Meal meal) {
        Meal savedMeal = mealRepository.save(meal);
        return new ResponseEntity<>(savedMeal, HttpStatus.CREATED);
    }
}
