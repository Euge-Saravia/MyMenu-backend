package mymenu.mymenu.services;

import java.util.List;

import org.springframework.stereotype.Service;

import mymenu.mymenu.models.ShoppingList;
import mymenu.mymenu.repositories.ShoppingListRepository;

@Service
public class ShoppingListService {
    
    private final ShoppingListRepository shoppingListRepository;

    public ShoppingListService(ShoppingListRepository shoppingListRepository){
        this.shoppingListRepository = shoppingListRepository;
    }

    public List<ShoppingList> getProducts(){
        return shoppingListRepository.findAll();
    }
}
