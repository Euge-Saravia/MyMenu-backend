package mymenu.mymenu.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import mymenu.mymenu.models.Meal;

public interface MealRepository extends JpaRepository<Meal, Integer> {
    
}
