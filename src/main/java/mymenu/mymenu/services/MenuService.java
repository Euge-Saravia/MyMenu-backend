package mymenu.mymenu.services;

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

    public ResponseEntity<Object> createMenu(Menu menu) {
        Menu savedMenu = menuRepository.save(menu);
        return new ResponseEntity<>(savedMenu, HttpStatus.CREATED);
    }
}
