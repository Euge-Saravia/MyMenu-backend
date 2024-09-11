package mymenu.mymenu.services;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import mymenu.mymenu.models.Menu;
import mymenu.mymenu.repositories.MenuRepository;


@Service
public class MenuService {
    private MenuRepository menuRepository;
   

    public MenuService(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    public List<Menu> getMenusByDate(LocalDate starDate, LocalDate enDate) {
        return menuRepository.findByDateBetweenOrderByDate(starDate, enDate);
    }

    public ResponseEntity<Object> createMenu(Menu menu) {
        Menu savedMenu = menuRepository.save(menu);
        return new ResponseEntity<>(savedMenu, HttpStatus.CREATED);
    }

    public List<Menu> getMenuByOneDate(LocalDate date, Integer mealType) {
        return menuRepository.findByDateAndMeal_Id(date, mealType);
    }

    public ResponseEntity<Object> deleteMenuById(int id) {
        if (menuRepository.existsById(id)) {
            menuRepository.deleteById(id);
            return new ResponseEntity<>("Menu deleted successfully", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Menu not found", HttpStatus.NOT_FOUND);
        }
    }
}
