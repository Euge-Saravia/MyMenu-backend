package mymenu.mymenu.services;

import java.sql.Date;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import mymenu.mymenu.models.Menu;
import mymenu.mymenu.models.Plate;
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

}
