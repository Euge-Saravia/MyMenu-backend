package mymenu.mymenu.controller;

import org.springframework.web.bind.annotation.RestController;

import mymenu.mymenu.models.Menu;
import mymenu.mymenu.services.MenuService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class MenuController {
    private MenuService menuService;

    public MenuController(MenuService menuService){
        this.menuService = menuService;
    }

    @PostMapping("/menus")
   public ResponseEntity<Object> createMenu(@RequestBody Menu menu){
    return menuService.createMenu(menu);
   }
    
}
