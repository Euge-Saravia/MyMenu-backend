package mymenu.mymenu.controller;

import org.springframework.web.bind.annotation.RestController;

import mymenu.mymenu.models.Meal;
import mymenu.mymenu.services.MealService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class MealController {

private MealService mealService;

public MealController(MealService mealService){
    this.mealService = mealService;
}

@PostMapping("/meals")
public ResponseEntity<Object> createMeal(@RequestBody Meal meal){
    return mealService.createMeal(meal);
}

}
