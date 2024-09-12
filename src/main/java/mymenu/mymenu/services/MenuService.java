package mymenu.mymenu.services;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import mymenu.mymenu.models.Menu;
import mymenu.mymenu.models.Plate;
import mymenu.mymenu.repositories.MenuRepository;
import mymenu.mymenu.repositories.PlateRepository;


@Service
public class MenuService {
    private MenuRepository menuRepository;
   private PlateRepository plateRepository;
   

    public MenuService(MenuRepository menuRepository, PlateRepository plateRepository) {
        this.menuRepository = menuRepository;
        this.plateRepository = plateRepository;
    }

    public List<Menu> getMenusByDate(LocalDate starDate, LocalDate enDate) {
        return menuRepository.findByDateBetweenOrderByDate(starDate, enDate);
    }

    // public ResponseEntity<Object> createMenu(Menu menu) {
    //     Menu savedMenu = menuRepository.save(menu);
    //     return new ResponseEntity<>(savedMenu, HttpStatus.CREATED);
    // }

    public ResponseEntity<Object> createMenu(Menu menu) {
    // Verifica si el plate tiene un ID
    if (menu.getPlate().getId() != 0) {
        // Busca el plate en la base de datos
        Optional<Plate> plateOpt = plateRepository.findById(menu.getPlate().getId());
        if (plateOpt.isPresent()) {
            // Si el plate existe, lo asigna al menú
            menu.setPlate(plateOpt.get());
        } else {
            // Si no existe, retorna un error
            return new ResponseEntity<>("Plate not found", HttpStatus.NOT_FOUND);
        }
    } else {
        // Si no tiene ID, usa CascadeType.PERSIST para crearlo
        // Esto sigue funcionando gracias a la cascada que tienes en la anotación.
    }

    // Ahora que hemos asegurado que el Plate existe o se creará, persistimos el Menu
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
