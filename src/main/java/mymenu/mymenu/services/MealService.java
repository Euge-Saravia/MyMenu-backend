package mymenu.mymenu.services;

import org.springframework.stereotype.Service;

import mymenu.mymenu.models.Meal;
import mymenu.mymenu.repositories.MealRepository;

@Service
public class MealService {
    
    private MealRepository mealRepository;

    public Meal creatMeal (Meal meal){
        return mealRepository.save(meal);
    }
}
