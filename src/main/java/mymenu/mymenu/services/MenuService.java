package mymenu.mymenu.services;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import mymenu.mymenu.models.Menu;
import mymenu.mymenu.repositories.MenuRepository;

@Service
public class MenuService {
    private MenuRepository menuRepository;

    public MenuService(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    public List<Menu> getMenusByDate(Date starDate, Date enDate){
        return menuRepository.findByDateBetweenOrderByDate(starDate, enDate);
    }

    public ResponseEntity<Object> createMenu(Menu menu) {
        Menu savedMenu = menuRepository.save(menu);
        return new ResponseEntity<>(savedMenu, HttpStatus.CREATED);
    }
<<<<<<< Updated upstream
=======

    public ResponseEntity<Object> addPlateToMenu(int menuId, Plate plate) {
    Menu menu = menuRepository.findById(menuId).orElse(null);
    if (menu != null) {
        menu.setPlate(plate);
        menuRepository.save(menu);
        return new ResponseEntity<>(menu, HttpStatus.OK);
    } else {
        return new ResponseEntity<>("Menu not found", HttpStatus.NOT_FOUND);
    }
}

 // Método para obtener un menú por fecha y tipo de comida
    public ResponseEntity<Object> getMenuByDateAndMeal(Date date, String mealType) {
        Optional<Menu> menu = menuRepository.findByDateAndMealType(date, mealType);

        if (menu.isPresent()) {
            return new ResponseEntity<>(menu.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>("No menu found for this date and meal type", HttpStatus.NOT_FOUND);
        }
    }

>>>>>>> Stashed changes
}
