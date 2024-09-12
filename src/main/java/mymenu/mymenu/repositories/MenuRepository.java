package mymenu.mymenu.repositories;


import java.util.List;
import java.time.LocalDate;
import org.springframework.data.jpa.repository.JpaRepository;

import mymenu.mymenu.models.Menu;

public interface MenuRepository extends JpaRepository<Menu, Integer> {

    public List<Menu> findByDateBetweenOrderByDate(LocalDate dateStart, LocalDate dateEnd);

    public List<Menu> findByDateAndMeal_Id(LocalDate date, Integer mealType);

}
