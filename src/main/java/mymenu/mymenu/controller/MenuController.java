package mymenu.mymenu.controller;

import org.springframework.web.bind.annotation.RestController;

import mymenu.mymenu.models.Menu;
import mymenu.mymenu.services.MenuService;

import java.sql.Date;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class MenuController {
    private MenuService menuService;

    public MenuController(MenuService menuService){
        this.menuService = menuService;
    }

    @GetMapping("/menus")
    public List<Menu> getMenusByDate(@RequestParam Date starDate,@RequestParam Date enDate) {
        return menuService.getMenusByDate(starDate, enDate);
    }
    
    

    @PostMapping("/menus")
   public ResponseEntity<Object> createMenu(@RequestBody Menu menu){
    return menuService.createMenu(menu);
   }
    
}
