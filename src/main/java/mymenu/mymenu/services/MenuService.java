package mymenu.mymenu.services;

import org.springframework.stereotype.Service;

import mymenu.mymenu.models.Menu;
import mymenu.mymenu.repositories.MenuRepository;

@Service
public class MenuService {
    private MenuRepository menuRepository;

    public Menu createMenu(Menu menu){
        return menuRepository.save(menu);
    }
}
