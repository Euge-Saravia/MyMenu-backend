package mymenu.mymenu.repositories;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import mymenu.mymenu.models.Menu;

public interface MenuRepository extends JpaRepository<Menu, Integer> {

    public List<Menu> findByDateBetweenOrderByDate(Date dateStart, Date dateEnd);

     @Query("SELECT m FROM Menu m WHERE m.date = :date AND LOWER(m.meal.type) = LOWER(:mealType)")
    Optional<Menu> findByDateAndMealType(Date date, String mealType);
    
}
